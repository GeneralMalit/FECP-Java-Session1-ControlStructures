package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String memberStatus = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        double price;
        switch(memberStatus){
            case "Regular":
                if(age < 18){
                    price = 50;
                }else if(age < 65){
                    price = 100;
                }else{
                    price = 75;
                }
                System.out.printf("Price: $%.2f", price);
                break;
            case "VIP":
                if(age < 18){
                    price = 75;
                }else if(age < 65){
                    price = 150;
                }else{
                    price = 112.5;
                }
                System.out.printf("Price: $%.2f", price);
                break;
            case "Premium":
                if(age < 18){
                    price = 100;
                }else if(age < 65){
                    price = 200;
                }else{
                    price = 150;
                }
                System.out.printf("Price: $%.2f", price);

                break;
            default:
                System.out.println("Invalid membership status entered.");
                break;

        }


    }
}