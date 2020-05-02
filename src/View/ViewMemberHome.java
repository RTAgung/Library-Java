package View;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ViewMemberHome extends JFrame {

    Font font = new Font(Font.MONOSPACED, Font.BOLD, 20);//membuat font
    Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 45);//membuat font

    javax.swing.border.Border border = LineBorder.createBlackLineBorder();

    JLabel lJudulHome = new JLabel("Ruang Baca");
    JLabel lBawahJudul = new JLabel("Disini kita membaca dengan senang hati!");

    public ViewMemberHome(){
        lJudulHome.setFont(font1);
        lJudulHome.setBounds(40, 40, 300, 50);

        lBawahJudul.setFont(font);
        lBawahJudul.setBounds(40, 90, 500, 30);

        setBounds(305, 0, 775, 800);
        setLayout(null);
        setVisible(true);

        add(lBawahJudul);
        add(lJudulHome);
    }
}
