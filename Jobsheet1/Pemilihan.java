package Jobsheet1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==================================");

        int tugas, kuis, uts, uas;
        System.out.print("Masukkan Nilai Tugas\t: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis\t: ");
        kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS\t: ");
        uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS\t: ");
        uas = sc.nextInt();

        System.out.println("===================================");
        System.out.println("===================================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("NILAI TIDAK VALID");
            System.out.println("===================================");
            System.out.println("===================================");
            return;
        }

        double nilaiAkhir;
        String huruf = "";
        String status;

        nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            huruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            huruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            huruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            huruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            huruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            huruf = "D";
        } else if (nilaiAkhir >= 0 && nilaiAkhir <= 39) {
            huruf = "E";
        }

        System.out.println("Nilai AKhir\t: " + nilaiAkhir);
        System.out.println("Nilai huruf\t: " + huruf);

        if (nilaiAkhir >= 51) {
            status = "SELAMAT ANDA LULUS";
        } else {
            status = "SEMANGAT, ANDA TIDAK LULUS";
        }

        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println(status);

    }

}
