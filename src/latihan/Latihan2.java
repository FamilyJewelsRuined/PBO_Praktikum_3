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
public class Latihan2 {
    public static void main(String[] args) {
        String jawaban, jawaban1;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Apakah anda mahasiswa? ");
        jawaban = scan.next();
        if( ("Iya".equals(jawaban)) || ("IYA".equals(jawaban)) ){
            System.out.print("Apakah anda selalu terlambat masuk kelas? ");
            jawaban1 = scan.next();
            if( ("tidak".equals(jawaban1)) || ("TIDAK".equals(jawaban1)) ){
                System.out.println("Bagus, Pertahankan!!!");
                
            }
        }
    }
    
    
}
