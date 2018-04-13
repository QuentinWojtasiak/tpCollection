/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcollection;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;

/**
 *
 * @author diginamic09
 */
public class TpCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Création des listes
        ArrayList<User> users1 = new ArrayList();
        ArrayList<User> users2 = new ArrayList();
        ArrayList<User> users3 = new ArrayList();
        
        // Création des utilisateurs
        User usr1 = new User("Jean",45,true);
        User usr2 = new User("Herbert",72,true);
        User usr3 = new User("Auguste",92,true);
        User usr4 = new User("Louis",12,true);
        User usr5 = new User("Jeanne",26,false);
        User usr6 = new User("Paulette",49,false);
        User usr7 = new User("Mamadou",17,true);
        User usr8 = new User("Wendy",29,false);
        User usr9 = new User("Lee",26,true);
        User usr10 = new User("Vladimir",37,true);

        // Ajout des utilistaeurs
        users1.add(usr1);
        users1.add(usr2);
        users1.add(usr3);
        users1.add(usr4);
        users1.add(usr5);
        users2.add(usr6);
        users2.add(usr7);
        users2.add(usr8);
        users2.add(usr9);
        users2.add(usr10);

        Collections.sort(users1, comparing(User::getName));
        
        users2.remove(usr7);
        
        users3.addAll(users1);
        users3.addAll(users2);

        
        // Affichage des utilisateurs
        for (User usr: users3)
        {
            System.out.println(usr.toString());
        }
        
        
    }
    
    
}
