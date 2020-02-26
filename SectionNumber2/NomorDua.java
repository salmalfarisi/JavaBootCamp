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
public class NomorDua {
    public static void main(String[] args) {
        // Do looping with for statement
        // Make output with int i as rows in program
        for(int i = 0; i<=10; i++)
        {
            // Make output with int j as columns in program
            for(int j = 0; j <= i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
