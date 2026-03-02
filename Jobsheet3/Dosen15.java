package Jobsheet3;

public class Dosen15 {
    public String kode;
    public String nama;
    public boolean jenisKelamin; // true = pria, false = wanita
    public int usia;

    public Dosen15(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampilInfo() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + usia);
        System.out.println("----------------------------");
    }
}
