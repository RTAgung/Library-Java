package View;

import Main.Member;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ViewMemberHome extends JFrame {

    Member member;

    Font font = new Font(Font.MONOSPACED, Font.BOLD, 20);//membuat font
    Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 45);//membuat font

    public JPanel pHome = new JPanel();

    JLabel lJudulHome = new JLabel("Ruang Baca");
    JLabel lBawahJudul = new JLabel("Disini kita membaca dengan senang hati!");
    JLabel lSambutan = new JLabel("");
    JLabel lSelamat = new JLabel("Selamat Datang Di");


    public ViewMemberHome(Member member){
        this.member = member;

        pHome.setLayout(null);
        pHome.setSize(800,670);

        lSambutan = new JLabel("Halo, " + member.getName());
        lSambutan.setFont(font);
        lSambutan.setBounds(40,60,500,30);

        lSelamat.setFont(font);
        lSelamat.setBounds(40,90,500,30);

        lJudulHome.setFont(font1);
        lJudulHome.setBounds(40, 120, 300, 50);

        lBawahJudul.setFont(font);
        lBawahJudul.setBounds(40, 170, 500, 30);

        pHome.add(lSambutan);
        pHome.add(lSelamat);
        pHome.add(lBawahJudul);
        pHome.add(lJudulHome);
    }
}
