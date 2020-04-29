package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewBuku extends JFrame {
    JLabel judul;

    JLabel lTitle = new JLabel("Title :");
    JTextField tfTitle = new JTextField();
    JLabel lAuthor = new JLabel("Author");
    JTextField tfAuthor = new JTextField();
    JLabel lGenre = new JLabel("Genre :");
    JTextField tfGenre = new JTextField();
    JLabel lStock = new JLabel("Stok :");
    JTextField tfStock = new JTextField();
    JLabel lSearch = new JLabel("Search");
    JTextField tfSearch = new JTextField();

    JButton bInsert = new JButton("INSERT");
    JButton bUpdate = new JButton("UPDATE");
    JButton bDelete = new JButton("DELETE");
    JButton bSearch = new JButton("SEARCH");
    JButton bRefresh = new JButton("REFRESH");
    JButton bReset = new JButton("RESET");

    JTable table;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;

    Object coloumnName[] = {"#", "Title","Author","Genre","Stok",""};

    public  ViewBuku(){
        tableModel = new DefaultTableModel(coloumnName,0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(840, 400);

        judul=new JLabel("DATA");
        add(judul);
        judul.setBounds(680,20,100,20);
        judul=new JLabel("BUKU");
        add(judul);
        judul.setBounds(680,40,100,20);

        add(scrollPane);
        scrollPane.setBounds(20,50,560,300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lSearch);
        lSearch.setBounds(20,20,50,20);
        add(lTitle);
        lTitle.setBounds(600,100,50,20);
        add(lAuthor);
        lAuthor.setBounds(600,130,50,20);
        add(lGenre);
        lGenre.setBounds(600,160,50,20);
        add(lStock);
        lStock.setBounds(600, 190, 50, 20);

        add(tfSearch);
        tfSearch.setBounds(80,20,300,20);
        add(tfTitle);
        tfTitle.setBounds(660,100,150,20);
        add(tfAuthor);
        tfAuthor.setBounds(660,130,150,20);
        add(tfGenre);
        tfGenre.setBounds(660,160,150,20);
        add(tfStock);
        tfStock.setBounds(660,190,150,20);

        add(bSearch);
        bSearch.setBounds(390,20,90,20);
        add(bRefresh);
        bRefresh.setBounds(490,20,90,20);
        add(bInsert);
        bInsert.setBounds(600,230,90,20);
        add(bUpdate);
        bUpdate.setBounds(720,230,90,20);
        add(bDelete);
        bDelete.setBounds(660,260,90,20);
        add(bReset);
        bReset.setBounds(660,290,90,20);
    }
        public  String getTitle(){
        return tfTitle.getText();
        }
        public  String getAuthor(){
        return tfAuthor.getText();
        }
        public  String getGenre(){
            return tfGenre.getText();
        }
        public  String getStock(){
            return tfStock.getText();
        }

}
