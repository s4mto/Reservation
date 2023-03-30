package org.example.menu;

import org.example.menu.UserMenu;
import org.example.model.User;
import org.example.model.Users;
import org.example.view.UserAdd;
import org.example.view.UserDelete;
import org.example.view.UserEdit;

public class UserController {
    public static void start(Users users) {


        while (true) {
            switch (UserMenu.view()) {
                case UserMenu.ADDUSER:
                    User user = UserAdd.view(users.nextUserId());
                    users.add(user);
                    Users.writeCSV(users);
//                    UserAdd.view();
                    break;
                case UserMenu.EDITUSER:
                    User useredit = UserEdit.edit();
                    break;
                case UserMenu.DELETEUSER:
                    UserDelete userDelete = new UserDelete();
                    userDelete.delete();
                    break;
                case UserMenu.EXIT:
                    return;
            }
        }
    }
}
