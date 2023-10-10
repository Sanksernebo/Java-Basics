package Week9;

import Week9.mooc.logic.ApplicationLogic;
import Week9.mooc.ui.TextUserInterface;
import Week9.mooc.ui.UserInterface;

public class Ex17 {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }

}