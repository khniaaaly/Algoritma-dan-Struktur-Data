package Jobsheet3;

import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen15[] arrayOfDosen15 = new Dosen15[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();

            Boolean jenisKelamin;
            if (jk.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen15[i] = new Dosen15(kode, nama, jenisKelamin, usia);
            System.out.println();
        }

        DataDosen15 data = new DataDosen15();

        System.out.println("===== DATA SEMUA DOSEN =====");
        data.dataSemuaDosen(arrayOfDosen15);

        data.jumlahDosenPerJenisKelamin(arrayOfDosen15);
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen15);
        data.infoDosenPalingTua(arrayOfDosen15);
        data.infoDosenPalingMuda(arrayOfDosen15);
    }
}
