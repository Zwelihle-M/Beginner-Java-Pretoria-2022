/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USERTeK
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class ArtistSearchOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int choice = -1;

double total = 0.0;

//Single dimensional array containing the names of artists

String artist[] = {"Master KG","DJ B Coffee","Bruno Mars","Foo Fighters","Taylor Swift"};
//Two dimensional array containing the sales value of three sale items, 5 - rows, 3 - columns

String sale_value[][] = {{"900000","800000","500000"},

{"700000","500000","500000"},

{"800000","100000","50000"},

{"100000","200000","200000"},

{"300000","100000","50000"}};


System.out.println("Enter a number (between 0 and 6) to view the artist's CD, DVD and blu-ray sales ");

System.out.println("__________________________________________________________________________________________");

choice = sc.nextInt();

sc.close();

if (choice < 1 || choice > 5){

System.out.println("Invalid choice");

return;

}


//String values are converted to double data type

double cd = Double.parseDouble(sale_value[choice-1][0]);

double dvd = Double.parseDouble(sale_value[choice-1][1]);

double bluray = Double.parseDouble(sale_value[choice-1][2]);

System.out.println(artist[choice-1] + " is in position "+ choice + " for sales");

System.out.println("CD Sales: " + (cd));

System.out.println("DVD Sales: " + (dvd));

System.out.println("BLU RAY Sales: " + (bluray));

total = cd + dvd + bluray;

System.out.println("Total: "+(total));

System.out.println("__________________________________________________________________________________________");

    }
    
}
