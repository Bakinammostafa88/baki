/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication160;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication160 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("enter a character:");
        char ch =scanner.next().charAt(0);
        if (ch >= '0' && ch<='9'){
            System.out.println("digit");
        }
        else if ((ch >='A' && ch<='Z') ||(ch >= 'a' &&ch<='z')){
            System.out.println("Letter");
        }
            
        else{
            System.out.println("other");
        }
        scanner.close();
    }
    
}
