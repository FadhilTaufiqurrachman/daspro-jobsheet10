import java.util.Scanner;
public class PertanyaanPercobaan4Jobsheet10 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlhMhs, jmlhMatkul;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jmlhMhs = sc.nextInt();
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        jmlhMatkul = sc.nextInt();
        sc.nextLine();
        System.out.println();

        int[][] nilai = new int[jmlhMhs][jmlhMatkul];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input Nilai Mahasiswa Ke-" + (i+1) + " : ");
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai Mata Kuliah " + (j+1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai Rata-Rata : " + totalPerSiswa / nilai[i].length);
            System.out.println();
        }

        System.out.println("====================================");
        System.out.println("Rata-Rata Nilai Setiap Mata Kuliah : ");
        for (int j = 0; j < jmlhMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jmlhMhs; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + " : " + totalPerMatkul / jmlhMhs);
        }

        sc.close();
    }
}