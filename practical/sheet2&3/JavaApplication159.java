/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication159;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication159 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("enter three integers:");
    
   int a = scanner.nextInt();
   int b = scanner.nextInt();
   int c = scanner.nextInt();
   
   if (a==b && b==c){
       System.out.println("all equal");
   }
   else if (a==b || b==c ||a==c){
       System.out.println("two number are equall");
   }
   else {
       System.out.println("All diffrant");
   }  
        scanner.close();
// TODO code application logic here
    }
    
}
