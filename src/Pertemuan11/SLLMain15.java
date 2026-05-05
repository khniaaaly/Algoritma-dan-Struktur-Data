import java.util.Scanner;
public class SLLMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList15 sll = new SingleLinkedList15();

        System.out.print("Jumlah data mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            MahasiswaL15 mhs = new MahasiswaL15(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
        System.out.println("\nData Linked List:");
        sll.print();

        System.out.println("Data index 1: ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();
        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}