/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg5;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter the number of days : ");
        
        int days=input.nextInt();
        
        int years = days/365;
        
        int weeks = (days-(years *365)) / 7;
        
        int days2 = (days - ((years * 365)+(weeks*7)) );
        
        System.out.println("Years : " + years);
        
        System.out.println("Weeks : " + weeks);
        
        System.out.println("Days : " + days2);
        
    }
    
}
