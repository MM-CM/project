/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Project;

import java.util.ArrayList;

/**
 *
 * @author danic
 */
public interface User {
    ArrayList<String> userID = new ArrayList<>();
    ArrayList<String> password = new ArrayList<>();
    ArrayList<String> contactNumber = new ArrayList<>();
    
    
       default boolean userExists(String username) {
        return userID.contains(username);
    }

    default boolean validatePassword(String username, String enteredPassword) {
        int index = userID.indexOf(username);
        return index != -1 && password.get(index).equals(enteredPassword);
    }
}

