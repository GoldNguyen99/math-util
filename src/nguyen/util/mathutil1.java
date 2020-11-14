/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nguyen.util;

import github.MathUltility;

/**
 *
 * @author ADMIN
 */
public class mathutil1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long expected = 120;
        long actual = MathUltility.getFactorial(5);
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);
        System.out.println("6!: 720, actual: " + MathUltility.getFactorial(6));
        System.out.println("0!: 1, actual: " + MathUltility.getFactorial(0));
        //muon nem ra ngoai le
        //illigalArgumentExeption 
        //tham so >20, tham so <0
        System.out.println("expected: IlligalArgumentException" + MathUltility.getFactorial(-5));
    }
    
}
