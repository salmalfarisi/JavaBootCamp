/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp2020;

import java.lang.Math;

/**
 *
 * @author RP300M
 */
public class NomorEmpat {
    public static void main(String[] args) {
        // Make output with int i as rows in program
        for(int i = 0; i<=10; i++)
        {
            // Detect if i mod 2 is 0 or not
            // if i mod 2 is 0
            if(i%2 == 0)
            {
                // Make output with int j as columns in program
                for(int j = 0; j < 5; j++)
                {
                    System.out.print(i * j);
                    System.out.print(" ");
                }
                int j = 0;
            }
            // if i mod 2 is not 0
            else
            {
                // Make output with int j as columns in program
                for(int j = 0; j < 5; j++)
                {
                    System.out.print(Math.pow(i, j));
                    System.out.print(" ");
                }
                int j = 0;
            }
            System.out.println(" ");
        }
    }
}
