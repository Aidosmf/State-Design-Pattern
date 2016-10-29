/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package statedpat_tp029483;

/**
 *
 * @author Aidosmf TP029483
 */
public class NoPermission implements UserState {

    private User user;
    
    public NoPermission(User newUser) {
        user = newUser;
    }
    
    @Override
    public void signIn(int passwordEntered) {
        if(passwordEntered == 1111) {
            System.out.println("*You have signed as Aidos \n");
            
            user.setName(Data.users.get(0).getName());
            user.setAddress(Data.users.get(0).getAddress());
            user.setEmail(Data.users.get(0).getEmail());
            user.setPassword(Data.users.get(0).getPassword());
            
            user.setUserState(user.getYesPermissionState());
            user.setCorrectPasswordEntered(true);
            
        } else if(passwordEntered == 2222) {
            System.out.println("*You have signed as Alan \n");
            
            user.setName(Data.users.get(1).getName());
            user.setAddress(Data.users.get(1).getAddress());
            user.setEmail(Data.users.get(1).getEmail());
            user.setPassword(Data.users.get(1).getPassword());
            
            user.setCorrectPasswordEntered(true);
            user.setUserState(user.getYesPermissionState());
            
        }else if(passwordEntered == 3333) {
            
            System.out.println("*You have signed as Vasya \n");
            
            user.setName(Data.users.get(2).getName());
            user.setAddress(Data.users.get(2).getAddress());
            user.setEmail(Data.users.get(2).getEmail());
            user.setPassword(Data.users.get(2).getPassword());
            
            user.setCorrectPasswordEntered(true);
            user.setUserState(user.getYesPermissionState());
            
        } else {

            System.out.println("*You have entered the wrong password \n");
            user.setCorrectPasswordEntered(false);
            user.setUserState(user.getNoPermissionState());
        }
    }

    @Override
    public void signOut() {
        System.out.println("*You need to sign in first \n");
    }

    @Override
    public void viewDetails() {
        System.out.println("*You need to sign in first \n");
    }

    @Override
    public void editDetails(String name, String address, String email, int password) {
        System.out.println("*You need to sign in first \n");
    }

    @Override
    public void showUsers() {
        System.out.println("*You need to sign in first \n");
    }

    @Override
    public void viewDetails(int userNumber) {
        System.out.println("*You need to sign in first \n");
    }

    
    
}
