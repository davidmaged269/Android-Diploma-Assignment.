/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package android.diploma.assignment.pkg1;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class AndroidDiplomaAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {         // Problem 2
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Please enter first number : ");
        
         int num1=input.nextInt();
         
         System.out.print("Please enter second number : ");
         
         int num2=input.nextInt();
         
         System.out.print("Please enter third number : ");

         int num3=input.nextInt();
         
         int sum=num1+num2+num3;
         
         System.out.println("Summation of 3 integers is " + sum);
    }
    
}
    

