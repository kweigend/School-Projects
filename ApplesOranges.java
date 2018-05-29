System.out.print/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apples.oranges;

/**
 *
 * @author Kelsey Weigend
 */
import java.util.Scanner;
public class ApplesOranges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inStockApples = 0;
        int neededApples = 0;
        int inStockOranges = 0;
        int neededOranges = 0;
        int orderApples = 0;
        int orderOranges = 0;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("How many apples are in stock?");
        inStockApples = scnr.nextInt();
        
        System.out.println("How many apples should be in stock?");
        neededApples = scnr.nextInt();
        
        System.out.println("How many oranges are in stock?");
        inStockOranges = scnr.nextInt();
        
        System.out.println("How many oranges should be in stock?");
        neededOranges = scnr.nextInt();
        
        orderApples = neededApples - inStockApples;
        orderOranges = neededOranges - inStockOranges;
        
        if (orderApples > 0) {
            System.out.println("Order " + orderApples + " apples.");
        } else {
            System.out.println("You don't need to order apples.");
        }
        
        if (orderOranges > 0) {
            System.out.println("Order " + orderOranges + " oranges.");
        } else {
            System.out.println("You don't need to order oranges.");
        }
       
        }
    }
    
