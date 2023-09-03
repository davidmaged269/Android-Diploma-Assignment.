/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg13;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Problem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        
        int num1=input.nextInt();
        
        
        System.out.print("Enter second number : ");
        
        int num2=input.nextInt();
        
        
        System.out.print("Enter third number : ");
        
         int num3=input.nextInt();
         
         int max;
         
         int min;
         
         if (num1>num2 && num1>num3){
             max=num1;
             System.out.println("Max element = " + max);
         }
         else if (num2>num1 && num2>num3){
             max=num2;
             System.out.println("Max element = " + max);
         }
         else if (num3>num1 && num3>num2){
             max=num3;
             System.out.println("Max element = " + max);
         }
         
         if (num1<num2 && num1<num3){
             min=num1;
             System.out.println("Min element = " + min);
         }
         else if (num2<num1 && num2<num3){
             min=num2;
             System.out.println("Min element = " + min);
         }
         else if (num3<num1 && num3<num2){
             min=num3;
             System.out.println("Min element = " + min);
         }
         
         
         
         
    }
    
}
