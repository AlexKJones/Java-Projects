/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparetwonumber;

/**
 *
 * @author alexjones
 */
public class CompareTwoNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=27, b=28;
        if (a==b) {
            System.out.println("Both are equal");
        }
        else if (a>b) {
            System.out.println("A is greater than B");
        }
        else {
            System.out.println("B is greater than A");
        }
    }
    
}
