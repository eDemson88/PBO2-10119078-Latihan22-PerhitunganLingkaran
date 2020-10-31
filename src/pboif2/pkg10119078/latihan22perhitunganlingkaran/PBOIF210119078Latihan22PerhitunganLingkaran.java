/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan22perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dia,rad,area,cir,PHI=3.14159;
        System.out.println("=======Perhitungan Lingkaran=======");
        System.out.printf("Masukan Nilai diameter Lingkaran : ");
        Scanner scanner = new Scanner (System.in);
        
        
        
        while (!scanner.hasNextDouble()){
            System.out.println("Nilai diameter tidak sesuai");
            System.out.println("");
            System.out.printf("Masukan Nilai diameter Lingkaran : ");
            scanner.next();
        }
        dia = scanner.nextDouble();
        
        rad = dia / 2;
        System.out.println("Jari jari lingkaran: " + (int)rad + "cm");
        
        area = (PHI * (rad * rad));
        System.out.println("Luas Lingkaran: " + String.format("%.2f", area) +"cm" );
        
        cir = (2 * PHI * rad);
        System.out.println("Keliling lingkaran: " + String.format("%.2f", cir) +"cm" );
        
    }
    
}
