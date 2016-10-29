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
public interface UserState {
    
    // Different states expected
    // HasPermission, NoPermission
    void signIn(int passwordEntered);
    void signOut();
    void showUsers();
    void viewDetails();    
    void viewDetails(int userNumber);  
    void editDetails(String name, String address, String email, int password);
            
}
