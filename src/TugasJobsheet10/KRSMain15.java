import java.util.Scanner;
public class KRSMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS15 antrian = new AntrianKRS15();

        int pilih;
        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Info Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();


            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    antrian.enqueue(new MahasiswaT15(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.dequeue2();
                    break;
                case 3:
                    System.out.println("Semua antrian:");
                    antrian.tampilSemua();
                    System.out.println("\n2 terdepan:");
                    antrian.tampilDepan2();
                    System.out.println("\nTerakhir:");
                    antrian.tampilAkhir();
                    break;
                case 4:
                    antrian.info();
                    break;
                case 5:
                    antrian.clear();
                    break;
            }
        } while (pilih != 0);
    }
}

