/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication217;

/**
 *
 * @author Student
 */
public class JavaApplication217 {

    
    
        
      

    public static void main(String[] args) {

        
        Car car = new Car("Toyota", "Corolla", 2023, 4);

        motorcycle motorcycle =
            new motorcycle("Honda", "CBR", 2022, 600);

       
        System.out.println("===== CAR DETAILS =====");
        car.displayDetails();

        System.out.println("\n===== MOTORCYCLE DETAILS =====");
        motorcycle.displayDetails();

    
        System.out.println("\n===== RENTAL PRICES =====");

        System.out.println("Car rental for 3 days: " +
        car.calculateRentalPrice(3));

        System.out.println("Motorcycle rental for 3 days: " +
        motorcycle.calculateRentalPrice(3));

        
        System.out.println("\n===== WITH DISCOUNT =====");

        System.out.println("Car with discount: " +
        car.calculateRentalPrice(3, 0.10));

        System.out.println("Motorcycle with discount: " +
        motorcycle.calculateRentalPrice(3, 0.10));

     
        System.out.println("\n===== OBJECT INFORMATION =====");

        System.out.println(car);
        System.out.println(motorcycle);
    }
}

    }
    
}
