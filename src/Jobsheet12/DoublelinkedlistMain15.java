import java.util.Scanner;

public class DoublelinkedlistMain15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Doublelinkedlist15 list = new Doublelinkedlist15();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data secara terbalik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    MahasiswaDDL15 mhsAwal = inputMahasiswaDDL15(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    MahasiswaDDL15 mhsAkhir = inputMahasiswaDDL15(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    MahasiswaDDL15 dataBaru = inputMahasiswaDDL15(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }
    public static MahasiswaDDL15 inputMahasiswaDDL15(Scanner scan) {
    System.out.print("NIM  : ");
    String nim = scan.nextLine();
    System.out.print("Nama : ");
    String nama = scan.nextLine();
    System.out.print("Kelas: ");
    String kelas = scan.nextLine();
    System.out.print("IPK  : ");
    double ipk = scan.nextDouble();
    scan.nextLine();

    return new MahasiswaDDL15(nim, nama, kelas, ipk);
    }
}
