/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array10;

/**
 *
 * @author renza
 */
public class ARRAY10 {

    public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
       int sum;
       
       System.out.print("Enter the number of array: ");
               int rowsize = sc.nextInt();
       System.out.print("Enter the number of index: ");
               int columnsize = sc.nextInt();
               
        int[][] array = new int[rowsize][columnsize];  
        
        for(int row=0; row < rowsize; row++){
            for(int col = 0; col < columnsize ;col++){
                System.out.print("Enter a number["+ (row) +"]["+(col) +"]: ");
            array[row][col] = sc.nextInt();
            }
            System.out.println("");
    }     
        
    for(int row=0; row < rowsize; row++){
        System.out.print("Array["+row+"]: ");
        sum = 0;
            for(int col = 0; col < columnsize ;col++){
                System.out.print(array[row][col] + ", ");
                 sum = sum + array[row][col]; 
        }  
            System.out.println("\tTOTAL: " + sum );
    }
    }
}
