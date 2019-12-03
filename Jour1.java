/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aoc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Guillaume Carlier
 */
public class Jour1 {

    //**********************ATTRIBUTS***********************/
    
    

    //**********************CONSTRUCTEURS***********************/

    

    //**********************GETTERS & SETTERS***********************/



    //**********************METHODES***********************/
      


    //**********************OVERRIDE METHODS***********************/
    public static void main(String[] args) throws Exception {
        int total = 0;
        File file = new File("D:\\AOC\\Jour1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int mass;
        int temp;
        String st; 
        while ((st = br.readLine()) != null) {
            mass = Integer.parseInt(st);
            mass = Math.round(mass/3) - 2;
            temp = mass;
            while ((Math.round(temp/3) - 2) > 0) {
                temp = Math.round(temp/3) - 2;
                mass += temp;
            }
            total += mass;
        } 
        System.out.println(total);
        
    }
}
