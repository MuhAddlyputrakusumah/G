/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ADDLY
 */
public class player {
      // definisi atribut
    String name;
    int speed;
    int healthPoin;
    int damage;
    int armour;
    // definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }
void attack (){
    System.out.println(name+" is Attack");
    System.out.println("Damage: "+damage);

}
void armour(){
    System.out.println(name+"is defense");
    System.out.println("Shield: "+armour);
}
    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
  
}
