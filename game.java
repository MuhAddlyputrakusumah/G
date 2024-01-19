/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasar;

/**
 *
 * @author ADDLY
 */
public class game {
    public static void main(String[] args){

        // membuat objek player
        player petani = new player();
        // mengisi atribut player
        petani.name = "Hero";
        petani.speed = 78;
        petani.healthPoin = 0;
        petani.armour = 10;
        petani.damage=80;
        // menjalankan method
        petani.run();
        petani.armour();
        petani.attack();

        if(petani.isDead()){
            System.out.println("Game Over!");
        }

    }
    
    
}
