/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg10;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Problem10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter number of seconds : ");
        
        int seconds=input.nextInt();
        
        int hours=(seconds/60)/60;
        
        int minutes=(seconds-((hours*60)*60))/60;
        
        int seconds2=(seconds-(((hours*60)*60)+(minutes*60)));
        
        System.out.println("H:M:S - " + hours + ":" + minutes + ":" + seconds2);
    }
    
}
