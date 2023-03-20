package org.example.model;

import java.util.ArrayList;

public class Account {
        private int UserId;
        private String Password;
        private String Role;

        public int getUserId() {
                return UserId;
        }

        public void setPassword(String password) {
                Password = password;
        }

        public String getRole() {
                return Role;
        }

        public void setRole(String role) {
                Role = role;
        }
}
