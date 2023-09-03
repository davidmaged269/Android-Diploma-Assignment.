/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg12;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input = new Scanner (System.in);
         
         System.out.print("Enter a Letter : ");
    
         char letter=input.next().charAt(0);
         
         if (letter=='a' || letter=='A' || letter=='e' ||letter=='E' || letter=='i' ||letter=='I' || letter=='o' || letter=='O' || letter=='u'|| letter=='U' ){
             System.out.println("Vowel");
         }
         else {
             System.out.println("Consonant");
         }
    }
    
}
