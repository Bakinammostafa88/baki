/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication93;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication93 {

    /**
     * @param args the command line arguments
     */
    
    public static int generateSecret(){
            return (int)(Math.random()*50)+1;
        }

        public static String cheakGuess(int guess,int secret){
            if (guess==secret){
                return "Correct";
    
            }
            else if(guess<secret){
                return"Higher";
            }
            else {
                return"lower";
            }  

        }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int secret=generateSecret();
        
        int[]guesses=new int[5];
        boolean found =false;
        
        for(int i=0;i<5;i++){
        System.out.print("Guess");
        
    
     guesses[i]=input.nextInt();
     String result=
      cheakGuess(guesses[i],secret);
     if(result.equals("Correct")){
         System.out.println("Correct in"+(i+1)+"attempts");
         found=true;
         break;
         
     }
     else{
         System.out.println(result);
     }
    }
     
                 
                 
        if(!found)  {
            System.out.println("Secret number is"+secret);
            
        }  
         input.close();
                 
                 
                 
           
                 
                 
     }   
         
         
         
         
         
         
}







 
        
    

