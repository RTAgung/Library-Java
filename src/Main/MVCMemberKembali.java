package Main;

import Controller.ControllerMemberKembali;
import Model.ModelMemberKembali;
import View.ViewMemberKembali;

public class MVCMemberKembali {
    Member member;

    public MVCMemberKembali(Member member) {
        this.member = member;
        ViewMemberKembali memberKembali = new ViewMemberKembali();
        ModelMemberKembali modelMemberKembali = new ModelMemberKembali(member);
        ControllerMemberKembali controllerMemberKembali = new ControllerMemberKembali(memberKembali, modelMemberKembali);
    }
}
