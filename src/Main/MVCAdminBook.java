package Main;

import Controller.ControllerAdminBook;
import Model.ModelAdminBook;
import View.ViewAdminBook;

public class MVCAdminBook {
    ViewAdminBook viewAdminBook = new ViewAdminBook();
    ModelAdminBook modelAdminBook = new ModelAdminBook();
    ControllerAdminBook controllerAdminBook = new ControllerAdminBook(viewAdminBook, modelAdminBook);
}