
package latihan;

/**
 *
 * @author lenovo
 */
public class Latihan7 {

    public static void main(String[] args) {

        int nilai = 92; //DULUNYA 92, KD KW KARENA SWITCH ITU HRS 100, 90, 80 ATAU APA NIGGA
        switch (nilai) {
            case 100:
                System.out.println("Luar biasa!");
                break;

            case 90:
                System.out.println("Kerja bagus!");
                break;

            case 80:
                System.out.println("Belajar lebih giat lagi!");
                break;

            default:
                System.out.println("Maaf, Anda gagal.");
        }
    }
}
