public class Kuis15 {
    public String idPembeli;
    public String nama;
    public String alamat;
    public int jmlItem;

    public Kuis15(String idPembeli, String nama, String alamat, int jmlItem) {
        this.idPembeli = idPembeli;
        this.nama = nama;
        this.alamat = alamat;
        this.jmlItem = jmlItem;
    }

    public void cetakInfo() {
        System.out.println("ID Pembeli             : " + idPembeli);
        System.out.println("Nama                   : " + nama);
        System.out.println("Alamat                 : " + alamat);
        System.out.println("Jumlah item yang dibeli: " + jmlItem);
        System.out.println("---------------------------------");
    }

    public void hitungPelanggan(int pelanggan) {
        idPembeli += pelanggan;
        System.out.println("Banyak pelanggan yang datang hari ini: " + pelanggan);
    }

}
