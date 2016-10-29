/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package statedpat_tp029483;

import java.io.IOException;

/**
 *
 * @author Aidosmf TP029483
 */
public class HasPermission implements UserState {
    
    private User user;
    
    public HasPermission(User newUser){

        user = newUser;
               
    }
    
    @Override
    public void signIn(int passwordEntered) {
        System.out.println("*You already signed in \n");
    }

    @Override
    public void signOut() {
        System.out.println("*You have signed out from the system \n");
        user.setCorrectPasswordEntered(false);
        user.setUserState(user.getNoPermissionState());
    }

    
    @Override
    public void viewDetails() {
        System.out.println("*There are your details:");
        System.out.println(user.toString());
        System.out.println(user.toString1());
    }
    
    public void viewDetails(int userNumber) {
        if (userNumber == 1) {
            System.out.println("*There are Aidos's details:");
            System.out.println(Data.users.get(0).toString() + "\n");
        } else if (userNumber == 2) {
            System.out.println("*There are Alan's details:");
            System.out.println(Data.users.get(1).toString() + "\n");
        } else if (userNumber == 3) {
            System.out.println("*There are Vasya's details:");
            System.out.println(Data.users.get(2).toString() + "\n");
        }
    }

    @Override
    public void editDetails(String name, String address, String email, int password) {
            System.out.println("*You have changed your details!");
            user.setName(name);
            user.setAddress(address);
            user.setEmail(email);
            user.setPassword(password);
    
    }

    @Override
    public void showUsers() {
        System.out.println("*There are all users in the system: ");
        System.out.println("1.Aidos");
        System.out.println("2.Alan");
        System.out.println("3.Vasya \n");
    }
    
    
   
}
