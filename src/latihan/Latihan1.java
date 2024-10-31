/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.util.Scanner; // Import the Scanner class
/**
 *
 * @author lenovo
 */
public class Latihan1 {
    public static void main(String[] args) {
        int belanja = 0;
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("total Belanjaan: Rp ");
        belanja = scan.nextInt();
        if (belanja > 100000) {
            System.out.println("Selamat, anda mendapatkan diskon");
        }
        System.out.println("Terima Kasih...");
        }
    }

