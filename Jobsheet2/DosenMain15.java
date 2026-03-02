package Jobsheet2;

public class DosenMain15 {
    public static void main(String[] args) {
        Dosen15 dosen1 = new Dosen15();
        dosen1.idDosen = "MQ";
        dosen1.nama = "Mungki Astiningrum, ST, M.Kom";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2006;
        dosen1.bidangKeahlian = "Algoritma dan Struktur Data";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2026) + " tahun");
        dosen1.ubahKeahlian("Aljabar Linear");
        dosen1.tampilkanInformasi();

        Dosen15 dosen2 = new Dosen15("RR", "Ridwan Rismanto, S.ST., M.Kom., Ph.D", true, 2000, "Basis Data");
        dosen2.tampilkanInformasi();
        System.out.println("Masa Kerja: " + dosen2.hitungMasaKerja(2026) + " tahun");
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Praktikum Basis Data");
        dosen2.tampilkanInformasi();
    }
}
