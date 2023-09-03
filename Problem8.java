/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg8;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Problem8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sum=0;
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the first number : ");
        
        int num1=input.nextInt();
        
        if(num1%2==1){
            sum=sum+num1;
        }
        
        System.out.print("Enter the second number : ");
        
        int num2=input.nextInt();
        
        if(num2%2==1){
            sum=sum+num2;
        }
        
        System.out.print("Enter the third number : ");
        
        int num3=input.nextInt();
        
        if(num3%2==1){
            sum=sum+num3;
        }
        
        System.out.print("Enter the fourth number : ");
        
        int num4=input.nextInt();
        
        if(num4%2==1){
            sum=sum+num4;
        }
        
        System.out.print("Enter the fifth number : ");
        
        int num5=input.nextInt();
        
        if(num5%2==1){
            sum=sum+num5;
        }
        
        System.out.println("Sum of all odd values : " + sum);
        
       
    }
    
}
