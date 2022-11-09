/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array7;

/**
 *
 * @author renza
 */
public class ARRAY7 {

    public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.print("Enter the size of array: ");
    int arraysize = sc.nextInt();
    
    int [] array = new int [arraysize];
  
    for(int i=0; i<arraysize; i++){
        System.out.print("Enter element "+ "["+(i+1) +"]"+": ");
        array[i]= sc.nextInt();
}
    
    int maximum = 0;
    
    System.out.print("ELEMENT: ");
    for(int i = 0; i<arraysize; i++){
    System.out.print(array[i] + " ,");
        if(array[i]>maximum){
            maximum=array[i];
        } 
    }
    System.out.println("\nMAXIMUM: " + maximum);
    }
}
