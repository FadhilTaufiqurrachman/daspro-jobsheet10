import java.util.Scanner;
public class TugasJobsheet10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlhResp = 10, jmlhPert = 6;
        double rataTotal, total = 0;
        double rataPert[] = new double[jmlhPert]; 
        double rataResp[] = new double[jmlhResp]; 

        int[][] nilai = new int[jmlhPert][jmlhResp];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Pertanyaan Ke-" + (i+1));
            int j = 0; 
            while (j < nilai[i].length) {
                System.out.print("Masukkan Nilai Dari Responden Ke-" + (j+1) + " (1-5) : ");
                nilai[i][j] = input.nextInt();
                if (nilai[i][j] < 1 || nilai[i][j] > 5) {
                    System.out.println("Nilai Tidak Sesuai, Silahkan Input Ulang.");
                    continue;
                }
                j++;
            }
            System.out.println();
        }
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                total+=nilai[i][j];
                rataPert[i]+=nilai[i][j];
                rataResp[j]+=nilai[i][j];
            }
            rataPert[i]/=jmlhResp;
        }

        for (int i = 0; i < jmlhPert; i++) {
            System.out.println("Rata-Rata Dari Pertanyaan Ke-" + (i+1) + " : " + rataPert[i]);
        }
        System.out.println();

        for (int i = 0; i < jmlhResp; i++) {
            rataResp[i]/=jmlhPert;
            System.out.println("Rata-Rata Dari Responden Ke-" + (i+1) + " : " + rataResp[i]);
        }
        System.out.println();
        
        rataTotal = total / (jmlhPert * jmlhResp);
        System.out.println("Rata-Rata Total Keseluruhan Adalah " + rataTotal);

        input.close();
    }
}