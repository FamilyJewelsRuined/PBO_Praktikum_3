/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

    import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class Tugas7 {


    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        System.out.print("Masukan Panjang Angka Genap: ");
        int panjang = tes.nextInt();
        
        System.out.println("Hasil");
        for (int i = 1; i <= panjang; i++) {
            System.out.println(i * 2);
        }
        
    }
}

