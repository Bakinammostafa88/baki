/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication162;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication162 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner =new Scanner(System.in);
       System.out.print("entera number:");
       int num =scanner.nextInt();
       int reverse =0;
       
       while (num >0){
           int digit =num % 10;
           reverse =reverse *10 +digit ;
           num /=10;
       }
        System.out.println("the reverse "+reverse);
        
        scanner.close();
        
        
        
        
        
    }
    
}
