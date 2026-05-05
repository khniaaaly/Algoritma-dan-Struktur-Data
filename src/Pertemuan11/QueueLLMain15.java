import java.util.Scanner;

public class QueueLLMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList15 queue = new QueueLinkedList15();
        int pilih;

        do {
            System.out.println("\n=== MENU QUEUE ===");
            System.out.println("1. Menambah Antrian");
            System.out.println("2. Memanggil Antrian");
            System.out.println("3. Tampil Terdepan & Terakhir");
            System.out.println("4. Tampil Semua");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
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
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    MahasiswaQL15 mhs = new MahasiswaQL15(nim, nama, kelas, ipk);
                    queue.enqueue(mhs);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    System.out.println("\n--- Data Terdepan ---");
                    queue.peekFront();

                    System.out.println("\n--- Data Terakhir ---");
                    queue.peekRear();
                    break;

                case 4:
                    queue.tampilSemua();
                    break;

                case 5:
                    queue.jumlahAntrian();
                    break;

                case 6:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);
    }
}