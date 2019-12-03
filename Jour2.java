package aoc;

/*
 * To change this license header, choose License Headers in temproject temproperties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillaume Carlier
 */
public class Jour2 {

    //**********************ATTRIBUTS***********************/



    //**********************CONSTRUCTEURS***********************/

    

    //**********************GETTERS & SETTERS***********************/



    //**********************METHODES***********************/
      


    //**********************OVERRIDE METHODS***********************/
    public static void main(String[] args) {
        // Parce que oui je m'en bas les couilles
        int tab[] = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,10,1,19,1,19,9,23,1,23,13,27,1,10,27,31,2,31,13,35,1,10,35,39,2,9,39,43,2,43,9,47,1,6,47,51,1,10,51,55,2,55,13,59,1,59,10,63,2,63,13,67,2,67,9,71,1,6,71,75,2,75,9,79,1,79,5,83,2,83,13,87,1,9,87,91,1,13,91,95,1,2,95,99,1,99,6,0,99,2,14,0,0};
        int ip = 0;
        int[] temp = new int[tab.length];
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                ip = 0;
                System.arraycopy(tab, 0, temp, 0, tab.length);
                
                temp[1] = x;
                temp[2] = y;
                for (int i = 0; i < tab.length; i++) {
                    int opcode = temp[ip];
                    int i1 = temp[ip+1], i2 = temp[ip+2], i3 = temp[ip+3];
                    
                    if (opcode == 1)
                        temp[i3] = temp[i1] + temp[i2];
                    else if (opcode == 2)
                        temp[i3] = temp[i1] * temp[i2];
                    else {
                        assert opcode == 99;
                        break;
                    }
                    ip += 4;
                }
                if (temp[0] == 19690720)
                    System.out.println(x + " " + y);
            }
        }
    }
            
}
