package View;

import javax.swing.*;
import java.awt.*;

public class ViewLogin extends JFrame {

    JLabel label = new JLabel("LOGIN");
    JLabel label1 = new JLabel("SIGN UP");

    JLabel lEmail = new JLabel("Email :");
    JTextField tfEmail = new JTextField();
    JLabel lPassword = new JLabel("Password");
    JTextField tfPassword = new JTextField();


    JLabel lEmail1 = new JLabel("Email :");
    JTextField tfEmail1 = new JTextField();
    JLabel lName = new JLabel("Name :");
    JTextField tfName = new JTextField();
    JLabel lNoHp = new JLabel("No Hp :");
    JTextField tfNoHp = new JTextField();
    JLabel lAddress = new JLabel("Address :");
    JTextField tfAddress = new JTextField();
    JLabel lPassword1 = new JLabel("Password :");
    JTextField tfPassword1 = new JTextField();

    public JButton bSignIn = new JButton("SIGN IN");
    public JButton bSignUp = new JButton("SIGN UP");
    public JButton bSimpan = new JButton("SIMPAN");
    public JButton bBatal = new JButton("BATAL");

    public ViewLogin(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(600, 500);


        add(label, BorderLayout.CENTER);
        label.setBounds(350, 20, 200, 20);
        add(label1, BorderLayout.CENTER);
        label1.setBounds(350, 20, 200, 20);

        add(lEmail);
        lEmail.setBounds(200, 80, 90, 20);
        add(tfEmail);
        tfEmail.setBounds(280, 80, 250, 20);
        add(lPassword);
        lPassword.setBounds(200, 110, 90, 20);
        add(tfPassword);
        tfPassword.setBounds(280, 110, 250, 20);

        add(bSignIn);
        bSignIn.setBounds(280, 190, 100, 20);
        add(bSignUp);
        bSignUp.setBounds(420, 190, 100, 20);


        add(lEmail1);
        lEmail1.setBounds(200, 80, 90, 20);
        add(tfEmail1);
        tfEmail1.setBounds(280, 80, 250, 20);
        add(lPassword1);
        lPassword1.setBounds(200, 110, 90, 20);
        add(tfPassword1);
        tfPassword1.setBounds(280, 110, 250, 20);
        add(lName);
        lName.setBounds(200, 130, 90, 20);
        add(tfName);
        tfName.setBounds(280, 130, 250, 20);
        add(lNoHp);
        lNoHp.setBounds(200, 160, 90, 20);
        add(tfNoHp);
        tfNoHp.setBounds(280, 160, 250, 20);
        add(lAddress);
        lAddress.setBounds(200, 190, 90, 20);
        add(tfAddress);
        tfAddress.setBounds(280, 190, 250, 20);

        add(bBatal);
        bBatal.setBounds(250, 220, 100, 20);
        add(bSimpan);
        bSimpan.setBounds(370, 220, 100, 20);

        moveSignIn();
    }
    public String getEmail() {
        return tfEmail.getText();
    }

    public String getPassword() {
        return tfPassword.getText();
    }

    public String getEmail1() {
        return tfEmail1.getText();
    }

    public String getPassword1() {
        return tfPassword1.getText();
    }

    public String getName() {
        return tfName.getText();
    }

    public String getNoHp() {
        return tfNoHp.getText();
    }

    public String getAddress() {
        return tfAddress.getText();
    }

    public void moveSignUp(){
        label.setVisible(false);
        lEmail.setVisible(false);
        lPassword.setVisible(false);
        tfEmail.setVisible(false);
        tfPassword.setVisible(false);
        bSignIn.setVisible(false);
        bSignUp.setVisible(false);

        label1.setVisible(true);
        lEmail1.setVisible(true);
        lPassword1.setVisible(true);
        tfEmail1.setVisible(true);
        tfPassword1.setVisible(true);
        lName.setVisible(true);
        tfName.setVisible(true);
        lNoHp.setVisible(true);
        tfNoHp.setVisible(true);
        lAddress.setVisible(true);
        tfAddress.setVisible(true);
        bSimpan.setVisible(true);
        bBatal.setVisible(true);
    }

    public void moveSignIn(){
        label.setVisible(true);
        lEmail.setVisible(true);
        lPassword.setVisible(true);
        tfEmail.setVisible(true);
        tfPassword.setVisible(true);
        bSignIn.setVisible(true);
        bSignUp.setVisible(true);

        label1.setVisible(false);
        lEmail1.setVisible(false);
        lPassword1.setVisible(false);
        tfEmail1.setVisible(false);
        tfPassword1.setVisible(false);
        lName.setVisible(false);
        tfName.setVisible(false);
        lNoHp.setVisible(false);
        tfNoHp.setVisible(false);
        lAddress.setVisible(false);
        tfAddress.setVisible(false);
        bSimpan.setVisible(false);
        bBatal.setVisible(false);
    }
}
