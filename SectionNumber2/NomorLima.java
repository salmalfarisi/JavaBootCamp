/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp2020;

/**
 *
 * @author RP300M
 */
public class NomorLima {
    public static void main(String[] args) {
        // Make output with int i as rows in program
        for(int i = 1; i <= 5; i++)
        {
            // Make output with int j as columns in program
            // the meaning of j-- is to make looping when start looping position is from the biggest number
            for(int j = 5; j >= i; j--)
            {
                // Make output from the biggest number
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
