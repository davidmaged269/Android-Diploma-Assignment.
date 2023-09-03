/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg4;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Please enter the width : ");
        
        int width=input.nextInt();
        
        System.out.print("Please enter the height  : ");
        
        int height=input.nextInt();
        
        int perimeter=(width*2)+(height*2);
        
        int area=width*height;
                
        System.out.println("The perimeter = " + perimeter);
        
         System.out.println("The area = " + area);
        
    }
    
}
