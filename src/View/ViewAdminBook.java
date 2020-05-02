package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewAdminBook extends JFrame {

    Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 45);//membuat font

    JLabel lJudulHome = new JLabel("Buku");

    JLabel lTitle = new JLabel("TITLE");
    public JTextField tfTitle = new JTextField();
    JLabel lAuthor = new JLabel("AUTHOR");
    public JTextField tfAuthor = new JTextField();
    JLabel lGenre = new JLabel("GENRE");
    public JTextField tfGenre = new JTextField();
    JLabel lStock = new JLabel("STOK");
    public JTextField tfStock = new JTextField();

    JLabel lSearch = new JLabel("SEARCH");
    public JTextField tfSearch = new JTextField();

    public JButton bInsert = new JButton("INSERT");
    public JButton bSearch = new JButton("SEARCH");
    public JButton bRefresh = new JButton("REFRESH");
    public JButton bReset = new JButton("RESET");

    public JTable table;
    public DefaultTableModel tableModel;
    JScrollPane scrollPane;

    public Object coloumnName[] = {"BookId", "#", "Title","Author","Genre","Stok"};

    public ViewAdminBook(){
        tableModel = new DefaultTableModel(coloumnName,0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(840, 400);

        lJudulHome.setFont(font1);
        add(lJudulHome);
        lJudulHome.setBounds(40, 40, 300, 50);

        add(scrollPane);
        scrollPane.setBounds(75, 400, 600, 200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lSearch);
        lSearch.setBounds(75,350,80,20);
        add(lTitle);
        lTitle.setBounds(75, 100, 160, 50);
        add(lAuthor);
        lAuthor.setBounds(75, 135, 160, 50);
        add(lGenre);
        lGenre.setBounds(75, 170, 160, 50);
        add(lStock);
        lStock.setBounds(75, 225, 50, 20);

        add(tfSearch);
        tfSearch.setBounds(130,350,350,20);
        add(tfTitle);
        tfTitle.setBounds(130,115,350,20);
        add(tfAuthor);
        tfAuthor.setBounds(130,150,350,20);
        add(tfGenre);
        tfGenre.setBounds(130,185,350,20);
        add(tfStock);
        tfStock.setBounds(130,225,350,20);

        add(bSearch);
        bSearch.setBounds(480,350,90,20);
        add(bRefresh);
        bRefresh.setBounds(570,350,100,20);
        add(bInsert);
        bInsert.setBounds(100,280,90,20);
        add(bReset);
        bReset.setBounds(400,280,90,20);

        setBounds(305, 0, 775, 800);
        setLayout(null);
        setVisible(true);
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
    public String getSearch() {
        return tfSearch.getText();
    }

}
