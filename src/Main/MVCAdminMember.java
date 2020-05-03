package Main;

import Controller.ControllerAdminMember;
import Model.ModelAdminMember;
import View.ViewAdminMember;

public class MVCAdminMember {
    ViewAdminMember viewAdminMember = new ViewAdminMember();
    ModelAdminMember modelAdminMember = new ModelAdminMember();
    ControllerAdminMember controllerAdminMember = new ControllerAdminMember(viewAdminMember, modelAdminMember);
}
