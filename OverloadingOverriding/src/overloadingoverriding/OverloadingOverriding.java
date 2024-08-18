/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloadingoverriding;

/**
 *
 * @author timmy
 */
public class OverloadingOverriding {

    /**
     * What is Method Overloading in Java?
     * Overloading a method, in simple terms, means creating a different method with the same name in the same class, but with a different parameter list.
     * @param args
     */
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        
        System.out.println("Sum, understand Overloading");
        
        System.out.println(cal.sum(5));
        System.out.println(cal.sum(3, 2));
        
        System.out.println("=====================================");
        
        Vihecle vihecle =  new Vihecle();
        Car car = new Car();
        Vihecle secondCar = new Car();
        
        vihecle.move();
        car.move();
        secondCar.move();
    }    
}
