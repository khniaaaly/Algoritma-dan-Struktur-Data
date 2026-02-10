package Jobsheet1;

import java.util.Scanner;

public class Tugas2 {
    static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilSemuaJadwal(String[][] jadwal) {
        System.out.println("\n==============================================");
        System.out.println("DAFTAR JADWAL KULIAH");
        System.out.println("==============================================");
        System.out.printf("%-25s %-10s %-10s %-10s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-25s %-10s %-10s %-10s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    static void tampilByHari(String[][] jadwal, String hari) {
        boolean ditemukan = false;
        System.out.println("\nJadwal Hari " + hari);

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                        jadwal[i][1] + " | " +
                        jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut");
        }
    }

    static void tampilByMK(String[][] jadwal, String mk) {
        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("\nDetail Jadwal:");
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];
        inputJadwal(jadwal, n, sc);

        int pilihan;
        do {
            System.out.println("\n===== MENU JADWAL KULIAH =====");
            System.out.println("1. Tampilkan semua jadwal");
            System.out.println("2. Cari jadwal berdasarkan hari");
            System.out.println("3. Cari jadwal berdasarkan mata kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilSemuaJadwal(jadwal);
                    break;
                case 2:
                    System.out.print("\nMasukkan hari: ");
                    String hari = sc.nextLine();
                    tampilByHari(jadwal, hari);
                    break;
                case 3:
                    System.out.print("\nMasukkan nama mata kuliah: ");
                    String mk = sc.nextLine();
                    tampilByMK(jadwal, mk);
                    break;
                case 4:
                    System.out.println("\nTerima kasih, program selesai.");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid!");
            }
        } while (pilihan != 4);
    }
}
