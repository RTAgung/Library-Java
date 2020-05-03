package Main;

import Controller.ControllerAdminHistory;
import Model.ModelAdminHistory;
import View.ViewAdminHistory;

public class MVCAdminHistory {
    ViewAdminHistory viewAdminHistory = new ViewAdminHistory();
    ModelAdminHistory modelAdminHistory = new ModelAdminHistory();
    ControllerAdminHistory controllerAdminHistory = new ControllerAdminHistory(viewAdminHistory, modelAdminHistory);
}
