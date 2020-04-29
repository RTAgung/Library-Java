package Controller;

import Model.ModelSignIn;
import View.ViewLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerSignIn implements ActionListener {

    ViewLogin viewLogin;
    ModelSignIn modelSignIn;

    public ControllerSignIn(ViewLogin viewLogin, ModelSignIn modelSignIn) {
        this.viewLogin = viewLogin;
        this.modelSignIn = modelSignIn;

        viewLogin.moveSignIn();
        viewLogin.bSignIn.addActionListener(this);
        viewLogin.bSignUp.addActionListener(this);
        viewLogin.bBatal.addActionListener(this);
        viewLogin.bSimpan.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewLogin.bSignIn){

        } else if (e.getSource() == viewLogin.bSignUp){
            viewLogin.moveSignUp();
        } else if (e.getSource() == viewLogin.bBatal){
            viewLogin.moveSignIn();
        } else if (e.getSource() == viewLogin.bSimpan){

        }
    }
}
