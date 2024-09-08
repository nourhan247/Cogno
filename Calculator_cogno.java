/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator_cogno;
import java.util.Scanner;
/**
 *
 * @author nourh
 */
public class Calculator_cogno {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter the first number: ");
        double Num1=sc.nextDouble();
        System.out.print("Enter the second number: ");
        double Num2=sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char ArithmeticOperator = sc.next().charAt(0);
       try{ 
        switch(ArithmeticOperator){
            case '+':
                double ResultAddition=Num1+Num2;
                System.out.println(Num1+" + "+Num2+" = "+ResultAddition);
                break;
            case '-':
                double ResultSubtraction=Num1-Num2;
                System.out.println(Num1+" - "+Num2+" = "+ResultSubtraction);
                break;
            case '*':
                double ResultMultiplication=Num1*Num2;
                System.out.println(Num1+" * "+Num2+" = "+ResultMultiplication);
                break;
                
            case '/':
                if(Num2==0)
                   throw new ArithmeticException("Division by zero is not allowed.");
  
                double ResultDivision=Num1/Num2;
                System.out.println(Num1+" / "+Num2+" = "+ResultDivision);
                break;
            default:
                    throw new IllegalArgumentException("Invalid operator.");    
                
         }
            
                } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } 
       catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
            
        }        
    }

