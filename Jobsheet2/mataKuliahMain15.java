package Jobsheet2;

public class mataKuliahMain15 {
    public static void main(String[] args) {
        mataKuliah15 mk1 = new mataKuliah15();
        mk1.kodeMK = "PASD";
        mk1.nama = "Praktikum Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();

        mataKuliah15 mk2 = new mataKuliah15("ASD", "Algoritma dan Struktur Data", 2, 4);
        mk2.tampilkanInformasi();

    }
}
