package Jobsheet2;

public class Dosen15 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("Kode Dosen     : " + idDosen);
        System.out.println("Nama           : " + nama);
        System.out.println("Status Aktif   : " + statusAktif);
        System.out.println("Tahun Beragbung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("--------------------------------------------------------");
    }

    Dosen15() {

    }

    Dosen15(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void setStatusAktif(boolean statusBaru) {
        statusAktif = statusBaru;
        System.out.println("Status aktif diubah menjadi: " + statusAktif);
    }

    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian diubah menjadi: " + bidangKeahlian);
    }
}
