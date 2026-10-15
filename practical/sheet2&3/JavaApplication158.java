/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication158;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication158 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
  System.out.print("enter number to check if divisible by 3or5or both:")  ;
  
  int num =scanner.nextInt();
  if(num %3 ==0 && num %5 ==0){
   System.out.println("Divisible by 3 and 5");  
}
  else if (num %3==0){
      System.out.println("Divisible by 3");
  } 
  else if (num %5==0){
   System.out.println("Divisible by 5");
  }     
  else{
      System.out.println("not divisible by 3 and 5");
  }
  scanner.close(
  );
    }
    
}
