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
public class TestUser {
     
public static void main(String[] args) {
        
        
        User user = new User();
        
        //please fill free to play with a user operations for better understanding
         
        System.out.println("--------------FIRST-USER-OPERATION--------------");
        //the scenario where user has inputed wrong password. Thus he is not able to use "User" operations.  
        //Also you cannot sign out twice.        
        user.signIn(9999);
        user.showUsers();
        user.viewDetails();
        user.editDetails("NewName", "address2", "email", 1111);
        user.viewDetails(1);
        user.viewDetails(2);
        user.viewDetails(3);
        user.signOut();
        user.signOut();
        
        System.out.println("--------------SECOND-USER-OPERATION--------------");
        //the scenario where user has inputed correct password. Thus he signed as the Alan User (Alan's password = 2222).
        //Alan by default can view his own details with password (e.g. viewDetails()). 
        //And by typing user's number (e.g. viewDetails(userNumber)) he can view any of users details without password which is logical
        //but he can change only his details. Thus, do not try to edit someone else's details. (e.g. editDetaisl(2, "", "", "", number))       
        user.signIn(2222);
        user.showUsers();
        user.viewDetails();
        user.editDetails("NewName2", "address2", "email3", 2020);
        user.viewDetails();
        user.viewDetails(3);
        user.signIn(3333);
        user.signOut();
        user.signOut();
        
        System.out.println("--------------THIRD-USER-OPERATION--------------");
        //the scenario where user has inputed correct password. Thus he signed as the Vasya User (Vasya's password = 3333).
        //And by typing user's number (e.g. viewDetails(userNumber)) he can view any of users details without password which is logical
        //but he can change only his details. Thus, do not try to edit someone else's details. (e.g. editDetaisl(2, "", "", "", number))
        user.signIn(3333);
        user.showUsers();
        user.viewDetails();
        user.editDetails("newName3", "newAddress3", "email3", 3030);
        user.viewDetails();
        user.viewDetails(2);
        user.viewDetails(3);
        user.viewDetails(1);
        user.signIn(1111);
        user.signOut();
        user.signOut();
       
    }
}
