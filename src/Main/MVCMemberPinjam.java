package Main;

import Controller.ControllerMemberPinjam;
import Model.ModelMemberPinjam;
import Model.ModelSignIn;
import View.ViewMemberPinjam;

public class MVCMemberPinjam {
    Member member;

    public MVCMemberPinjam(Member member) {
        this.member = member;
        ViewMemberPinjam viewMemberPinjam = new ViewMemberPinjam();
        ModelMemberPinjam modelMemberPinjam = new ModelMemberPinjam(member);
        ControllerMemberPinjam controllerMemberPinjam = new ControllerMemberPinjam(viewMemberPinjam, modelMemberPinjam);
    }
}
