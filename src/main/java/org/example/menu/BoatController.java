package org.example.menu;


import org.example.menu.MainMenuSina;
import org.example.model.Boats;

public class BoatController {
    public static void start(Boats boats) {
        while (true) {
            switch (BoatMenu.view()) {
                case MainMenuSina.BOATS:
                    break;
                case MainMenuSina.BOATTYPES:
                    BoatController.start(boats);
                    break;
                case MainMenuSina.EXIT:
                    return;
            }
        }

    }
}
