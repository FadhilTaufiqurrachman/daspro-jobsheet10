import java.util.Scanner;
public class PertanyaanPercobaan2Jobsheet10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next, menu;
        int baris, kolom;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("====================Bioskop====================");
            System.out.println("Pilihan Menu");
            System.out.println("1. Input Data penonton.\n" + 
                                "2. Tampilkan Daftar Penonton.\n" + 
                                "3. Exit.");
            System.out.println("===============================================");
            System.out.print("Masukkan Nomor Menu : ");
            menu = sc.nextLine();
                switch (menu) {
                    case "1":
                        while (true) {
                            System.out.print("Masukkan Nama : ");
                            nama = sc.nextLine();
                            while (true) { 
                                System.out.print("Masukkan Baris : ");
                                baris = sc.nextInt();
                                sc.nextLine();
                                    if (baris <= 0) {
                                        System.out.println("Input Tidak Valid.");
                                        continue;
                                    } else if (baris > penonton.length) {
                                        System.out.println("Kursi Tidak Tersedia.");
                                        continue;
                                    }
                                    
                                System.out.print("Masukkan Kolom : ");
                                kolom = sc.nextInt();
                                sc.nextLine();
                                    if (kolom <= 0) {
                                        System.out.println("Input Tidak Valid.");
                                        continue;
                                    } else if (kolom > penonton[0].length) {
                                        System.out.println("Kursi Tidak Tersedia.");
                                        continue;
                                    }
                                if (penonton[baris-1][kolom-1] != null) {
                                    System.out.println("Mohon Maaf Kursi Sudah Terisi, Silahkan Memilih Kursi Yang Lain.");
                                } else if (penonton[baris-1][kolom-1] == null) {
                                    System.out.println("Terima Kasih Sudah Memesan");
                                    break;
                                }
                            }
                            penonton[baris-1][kolom-1] = nama;
                            System.out.println();
                            System.out.print("Input Penonton Lainnya? (Y/N) : ");
                            next = sc.nextLine();
                            if (next.equalsIgnoreCase("N")) {
                                break;
                            }    
                        }
                        System.out.println();
                        break;

                    case "2":
                        for (int i = 0; i < penonton.length; i++) {
                            System.out.println(" Ketersediaan Kursi Penonton Pada Baris Ke-" + (i+1));
                            for (int j = 0; j < penonton[i].length; j++) {
                                if (penonton[i][j] == null) {
                                    System.out.print("*** \t\t");
                                } else {
                                    System.out.printf("%s \t\t", penonton[i][j]);
                                }
                            }
                            System.out.println();
                        }
                        System.out.println();
                        break;
                    
                    case "3":
                        System.out.println("Program Selesai, Terima Kasih.");
                        break;
                    default:
                    System.out.println("Input Tidak Valid, Silahkan Input Ulang.");
                        break;
                }

            if (menu.equalsIgnoreCase("3")) {
                break;
            }
        } 
    }
}