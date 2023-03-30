package org.example.menu;


import org.example.menu.MainMenuSina;
import org.example.model.Model;

public class MainController {
    public static void start() {
        Model model = new Model();

        // @todo login

        while (true) {
            switch (MainMenuSina.view()) {
                case MainMenuSina.BOATS:
                    break;
                case MainMenuSina.BOATTYPES:
                    BoatTypeController.start(model.boatTypeList);
                    break;
                case MainMenuSina.EXIT:
                    return;
            }
        }
    }
}
