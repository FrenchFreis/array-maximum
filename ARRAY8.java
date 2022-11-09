/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array8;

/**
 *
 * @author renza
 */
public class ARRAY8 {

    public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.print("Enter the size of array: ");
    int arraysize = sc.nextInt();
    
    int [] main = new int [arraysize];
    int [] even = new int [arraysize];
    int [] odd = new int [arraysize];
    for(int i=0; i<arraysize; i++){
        System.out.print("Enter element "+ "["+(i+1) +"]"+": ");
        main[i]= sc.nextInt();     
}
    int eeven = 0, oodd = 0;
    
    for(int i = 0; i<arraysize; i++){
        if(main[i]%2 == 0){
            even[eeven++]=main[i];
        }
        else
            odd[oodd++]=main[i];
        }
   
    System.out.print("ELEMENT: ");
    for(int i = 0; i<arraysize; i++){
        System.out.print(main[i] + " ,");
    }
    
    System.out.print("\nODD: ");
     for(int i = 0; i<arraysize; i++){
     System.out.print(odd[i] + " ,");
    }
     
    System.out.print("\nEVEN: ");
    for(int i = 0; i<arraysize; i++){
     System.out.print(even[i] + " ,");
    }
    }
}
