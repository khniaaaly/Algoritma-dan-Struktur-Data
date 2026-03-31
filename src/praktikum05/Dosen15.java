public class Dosen15 {
    String kode;
    String nama;
    boolean jenisKel; //T = L, F = P
    int usia;

    Dosen15(String kd, String nm, boolean jk, int umur) {
        kode = kd;
        nama = nm;
        jenisKel = jk;
        usia = umur;
    }

    void tampil() {
        String jk = jenisKel ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("Usia: " + usia);
    }
}
