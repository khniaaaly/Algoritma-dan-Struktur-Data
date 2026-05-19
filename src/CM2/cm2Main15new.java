import java.util.Scanner;

public class cm2Main15new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli15new antrian = new DLLPembeli15new();
        DLLPesanan15new pesanan = new DLLPesanan15new();
        int pilih;
        int nomorAntrian = 1;
        int kodePesanan = 100;

        do { 
            System.out.println("\n===========================================");
            System.out.println("        SISTEM ANTRIAN ROYAL DELISH        ");
            System.out.println("===========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Anttrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    Pembeli15new p = new Pembeli15new(nomorAntrian, nama, hp);
                    antrian.tambahAntrian(p);
                    System.out.println("Antrian berhasil di tambahkan dengan nomor: " + nomorAntrian);
                    nomorAntrian++;
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    Pembeli15new keluar = antrian.hapusAntrian();
                    if (keluar != null) {
                        System.out.print("Kode Pesanan : " + kodePesanan);
                        System.out.print("\nNama Pesanan : ");
                        String menuPesanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        Pesanan15 psn = new Pesanan15(kodePesanan, menuPesanan, harga);
                        pesanan.tambahPesanan(psn);
                        System.out.println(keluar.namaPembeli + " telah memesan " + menuPesanan);
                        kodePesanan++;
                    }
                    break;
                case 4:
                    pesanan.tampilPesanan();
                    break;
                case 0:
                    System.out.println("Antrian Selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilih != 0);
    }
}
