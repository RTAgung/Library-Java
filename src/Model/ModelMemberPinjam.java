package Model;

import Main.Member;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ModelMemberPinjam {
    Statement statement;
    Member member;

    public ModelMemberPinjam(Member member) {
        this.member = member;
    }

    public int getCountBooks(){
        int total = 0;
        try {
            String query = "SELECT COUNT(*) as Count FROM books";
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
            String query = "SELECT * FROM books";
            statement = Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            int i = 0;
            while (resultSet.next()){
                data[i][0] = resultSet.getString("BookId");
                data[i][1] = "" + (i+1);
                data[i][2] = resultSet.getString("BookTitle");
                data[i][3] = resultSet.getString("Author");
                data[i][4] = resultSet.getString("Genre");
                data[i][5] = resultSet.getString("Stock");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        return data;
    }

    public int checkPinjam(String bookId){
        int result = 1;
        try {
            String query = "SELECT Stock FROM books WHERE BookId = " + bookId;
            statement =  Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                int sum = resultSet.getInt("Stock");
                if (sum == 0) {
                    result = 0;
                    JOptionPane.showMessageDialog(null, "Stok Habis!");
                }
            }

            query = "SELECT COUNT(*) as Count FROM kartu_pinjam WHERE " +
                    "BookId = " + bookId + " AND Email = '" + member.getEmail() + "' AND Status = 'dipinjam'";
            ResultSet resultSet2 = statement.executeQuery(query);
            if (resultSet2.next()){
                int sum = resultSet2.getInt("Count");
                if (sum > 0) {
                    result = 0;
                    JOptionPane.showMessageDialog(null, "Buku Sedang Dipinjam!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        return result;
    }

    public int pinjam(String bookId){
        int result = 0;
        try {
            if (checkPinjam(bookId) == 1){
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDateTime now = LocalDateTime.now();
                String date = dtf.format(now);

                String query = "INSERT INTO kartu_pinjam VALUES " +
                        "('', '" + member.getEmail() + "', '" + bookId + "', '" + date + "' ,'' ,'dipinjam')";
                statement = Database.getConnection().createStatement();
                statement.executeUpdate(query);
                updateBooks(bookId);
                result = 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        return result;
    }

    public void updateBooks(String bookId){
        try {
            String query = "SELECT Stock FROM books WHERE BookId = " + bookId;
            statement =  Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            int sum = resultSet.getInt("Stock");
            sum--;
            query = "UPDATE books SET Stock = " + sum + " WHERE BookId = '" + bookId + "'";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}