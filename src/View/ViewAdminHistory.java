package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewAdminHistory extends JFrame {
    Font font = new Font(Font.MONOSPACED, Font.BOLD, 45);//membuat font
    Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 17);

    JLabel lJudulHome = new JLabel("History");
    JLabel lJudul1 = new JLabel("History ini merupakan Informasi Peminjaman Buku");

    JLabel lSearch = new JLabel("SEARCH");
    public JTextField tfSearch = new JTextField();

    public JButton bSearch = new JButton("SEARCH");
    public JButton bRefresh = new JButton("REFRESH");

    public JTable table;
    public DefaultTableModel tableModel;
    JScrollPane scrollPane;

    public Object coloumnName[] = {"#", "Name Book", "Email Peminjam","Tgl Pinjam","Tgl Kembali"};

    public  ViewAdminHistory() {
        tableModel = new DefaultTableModel(coloumnName, 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(775,800);
        setBounds(305, 0, 775, 800);


        lJudulHome.setFont(font);
        add(lJudulHome);
        lJudulHome.setBounds(40, 40, 500, 50);

        lJudul1.setFont(font1);
        add(lJudul1);
        lJudul1.setBounds(80, 80, 600,100);

        add(scrollPane);
        scrollPane.setBounds(75, 300, 600, 200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lSearch);
        lSearch.setBounds(75,200,80,20);
        add(tfSearch);
        tfSearch.setBounds(130,200,350,20);

        add(bSearch);
        bSearch.setBounds(480,200,90,20);
        add(bRefresh);
        bRefresh.setBounds(570,200,100,20);
    }

    public String getSearch() {
        return tfSearch.getText();
    }
}
