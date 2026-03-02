package Jobsheet2;

public class mataKuliah15 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama            : " + nama);
        System.out.println("SKS             : " + sks);
        System.out.println("Jumlah Jam      : " + jumlahJam);
        System.out.println("------------------------------------------");
    }

    mataKuliah15() {

    }

    mataKuliah15(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jamBaru) {
        jumlahJam += jamBaru;
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jamBaru2) {
        if (jumlahJam >= jamBaru2) {
            jumlahJam -= jamBaru2;
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan, jam tidak mencukupi.");
        }
    }
}
