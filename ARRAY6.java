/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array6;

/**
 *
 * @author renza
 */
public class ARRAY6 {

    public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);

    int totalsum = 0;
    
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    
    int [] num = new int [size];
  
    for(int i=0; i<size; i++){
        System.out.print("Enter element "+ "["+(i+1) +"]"+": ");
        num[i]= sc.nextInt();     
}
    
    System.out.print("Element: ");
    
    for(int i=0; i<size; i++){
       System.out.print(num[i] + " ,");
        totalsum = totalsum + num[i];
    }
    System.out.println("\nTOTAL: " + totalsum );
    }
}
