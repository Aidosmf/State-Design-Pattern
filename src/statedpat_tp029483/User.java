/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package statedpat_tp029483;

import java.util.ArrayList;

/**
 *
 * @author Aidosmf TP029483
 */
public class User {
    
        
    private UserState hasPermission;
    private UserState noPermission;
    
    private UserState userState;
    
    private String name;
    private String address;
    private String email;        
    private int password;
    
    private boolean correctPasswordEntered = false;        
            
    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getEmail() {return email;}
    public int getPassword() {return password;}
    
    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setEmail(String email) {this.email = email;}
    public void setPassword(int password) {this.password = password;}
    
    public boolean getCorrectPasswordEntered() {return correctPasswordEntered;}
    public void setCorrectPasswordEntered(boolean set) {correctPasswordEntered = set;}
    
    public User(String name, String address, String email, int password){
        
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
        
    } 
    
    public User(){
        
        hasPermission = new HasPermission(this);
        noPermission = new NoPermission(this);

        userState = noPermission;
        
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Email: " + email;
    }
    
    public String toString1(){
        return "Password: " + password + "\n";
    }
    
    void setUserState(UserState newUserState){
            userState = newUserState;
    }


    public void signIn(int passwordEntered) {
            userState.signIn(passwordEntered);
    }

    public void signOut() {
            userState.signOut();
    }
    
    public void showUsers() {
        userState.showUsers();
    }
    
    public void viewDetails() {
        userState.viewDetails();
    }
        
    
    public void viewDetails(int userNumber) {
        userState.viewDetails(userNumber);
    }
    
    public void editDetails(String name, String address, String email, int password){
        userState.editDetails(name,  address,  email,  password);
    }
    
    public UserState getUserState() {
        return userState;
    }

    public UserState getYesPermissionState() { return hasPermission; }
    public UserState getNoPermissionState() { return noPermission; }       
    
}
