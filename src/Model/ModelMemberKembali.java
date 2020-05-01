package Model;

import Main.Member;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ModelMemberKembali {
    Statement statement;
    Member member;

    public ModelMemberKembali(Member member) {
        this.member = member;
    }

    public int getCountBooks(){
        int total = 0;
        try {
            String query = "SELECT COUNT(*) as Count FROM kartu_pinjam k JOIN books b " +
                    "ON k.BookId = b.BookId WHERE k.Email = '" + member.getEmail() + "'";
            statement = Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()){
                total = resultSet.getInt("Count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        return total;
    }

    public String[][] getAllBooks(){
        String[][] data = new String[getCountBooks()][6];
        try{
            String query = "SELECT * FROM kartu_pinjam k JOIN books b " +
                    "ON k.BookId = b.BookId WHERE k.Email = '" + member.getEmail() + "'";
            statement = Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            int i = 0;
            while (resultSet.next()){
                data[i][0] = resultSet.getString("NoCard");
                data[i][1] = "" + (i+1);
                data[i][2] = resultSet.getString("BookTitle");
                data[i][3] = resultSet.getString("Author");
                data[i][4] = resultSet.getString("Genre");
                data[i][5] = resultSet.getString("TglPinjam");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        return data;
    }

    public int kembali(String noCard){
        int result = 0;
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            String date = dtf.format(now);

            String query = "UPDATE kartu_pinjam " +
                    "SET Status = 'dikembalikan', TglKembali = '" + date + "' " +
                    "WHERE NoCard = " + noCard;
            statement = Database.getConnection().createStatement();
            statement.executeUpdate(query);
            updateBooks(noCard);
            result = 1;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        return result;
    }

    public void updateBooks(String noCard){
        try {
            String bookId = "0";
            String query = "SELECT b.BookId as BookId FROM kartu_pinjam k JOIN books b " +
                    "ON k.BookId = b.BookId WHERE k.NoCard = " + noCard;
            statement = Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()){
                bookId = resultSet.getString("BookId");
            }

            query = "SELECT Stock FROM books WHERE BookId = " + bookId;
            statement =  Database.getConnection().createStatement();
            resultSet = statement.executeQuery(query);
            int sum = resultSet.getInt("Stock");
            sum++;
            query = "UPDATE books SET Stock = " + sum + " WHERE BookId = '" + bookId + "'";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}
