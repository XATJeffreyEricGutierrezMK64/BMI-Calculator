/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.calculator;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Jeffrey Eric Gutierrez 
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the BMI calculator!");
        //weight in pounds / height in inches squared multiplied by 703
        System.out.println("Enter your height in inches");
        Double height = sc.nextDouble();
        System.out.println("Enter your weight in pounds(lbs)");
        Double weight = sc.nextDouble();
        double factorY = Math.pow(height, 2);
        Double factorA = weight/factorY;
        double factorZ = factorA * 703;
        System.out.println("Your BMI is: " + factorZ);
        
        if (factorZ==24){
            System.out.println("Your bmi is in the normal range");
        }
        else{
            System.out.println("If you scored higher than 24 or less than 18, then you are underweight or overweight");
        }
        if (factorZ>30){
            System.out.println("You are obese, this can lead to serious health issues");
        }
        if (factorZ<18)
            System.out.println("You are underweight, this can lead to serious health issues");
        
    }
    
}
