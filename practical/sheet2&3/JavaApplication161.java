/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication161;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication161 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an integer n:");
        
        int n = scanner.nextInt();
        
        for(int i=1 ;i<=n;i++){
            for( int j=1 ; j<=i;j++){ 
            System.out.print(j);
        }
            System.out.println("");
        }
        
    
    scanner.close();
    }
    
}
