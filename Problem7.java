/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg7;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        
        int number=input.nextInt();
        
        if(number>=0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
    
}
