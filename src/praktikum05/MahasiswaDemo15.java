import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
        int jmlMhs = 5;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("-------------------------------");

            Mahasiswa15 m = new Mahasiswa15(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("---------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC)");
        list.insertionSort();
        list.tampil();
    }
}
