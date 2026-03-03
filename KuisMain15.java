import java.util.Scanner;

public class KuisMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Kuis15[] arrayOfpelanggan = new Kuis15[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data pelanggan ke-" + (i + 1));

            System.out.print("ID Pembeli             : ");
            String idPembeli = sc.nextLine();
            System.out.print("Nama                   : ");
            String nama = sc.nextLine();
            System.out.print("Alamat                 : ");
            String alamat = sc.nextLine();
            System.out.print("Jumlah item yang dibeli: ");
            int jmlItem = sc.nextInt();
            sc.nextLine();

            arrayOfpelanggan[i] = new Kuis15(idPembeli, nama, alamat, jmlItem);
            System.out.println();
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data pelanggan ke-" + (i + 1));
            arrayOfpelanggan[i].cetakInfo();
        }
    }

}
