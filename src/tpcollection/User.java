/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcollection;

/**
 *
 * @author diginamic09
 */
public class User {
    public String name;
    public int age;
    public boolean isMale;
    
    public User(String name, int age, boolean male)
    {
        this.age=age;
        this.isMale=male;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }
    
    public String toString()
    {
        if(this.isMale==true)
            return "Nom : "+this.name+"  Age : "+this.age+ "ans  Genre : Homme";
        return "Nom : "+this.name+"  Age : "+this.age+ "ans  Genre : Femme";
    }

}
