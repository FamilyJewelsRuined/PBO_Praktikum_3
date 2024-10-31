/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Latihan4 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10), hasil = a + b;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Berapakah hasil penjumlahan dari " + a + " dan " + b + " ?");
        int jawaban = scan.nextInt();
        if (jawaban == hasil) {
            System.out.println("Selamat, Jawaban anda benar");
        } else {
            System.out.println("Maaf, Jawaban yang benar adalah " + hasil);

        }
    }
}
