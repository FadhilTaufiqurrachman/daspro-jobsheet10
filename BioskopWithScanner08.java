import java.util.Scanner;
public class BioskopWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;

        String[][] penonton = new String[4][2];

        while (true) { 
            System.out.print("Masukkan Nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan Baris : ");
            baris = sc.nextInt();
            System.out.print("Masukkan Kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;
            
            System.out.print("Input Penonton Lainnya? (Y/N) : ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("N")) {
                break;
            }
        }
        sc.close();
    }
}