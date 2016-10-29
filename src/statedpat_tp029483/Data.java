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
public class Data {
    private static User aidos = new User("Aidos Sabit", "One South","aidosmf@gmail.com", 1111);
    private static User alan = new User("Alan Edel", "Endah Promenade","alanedel@gmail.com", 2222);
    private static User vasya = new User("Vasya Vladimer", "Russia","vasya@gmail.com", 3333);
    
    static ArrayList<User> users = new ArrayList<User>();
    
    static {
        users.add(aidos);
        users.add(alan);
        users.add(vasya);
    }
}
