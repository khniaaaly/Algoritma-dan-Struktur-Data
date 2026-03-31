import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DosenData15 list = new DosenData15();

        int pilih;
        do { 
            System.out.println("\nMENU");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia)");
            System.out.println("4. Sorting DSC (Usia)");
            System.out.println("5. Insertion Sort(ASC)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jumlah data: ");
                    int jumlah = sc.nextInt();
                    sc.nextLine(); // buang enter

                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("Data Dosen ke-" + (i + 1));
                        System.out.print("Kode: ");
                        String kd = sc.nextLine();
                        System.out.print("Nama: ");
                        String nm = sc.nextLine();
                        System.out.print("Jenis Kelamin (Laki-laki/Perempuan): ");
                        String jkInput = sc.nextLine();
                        boolean jk;
                        if (jkInput.equalsIgnoreCase("laki-laki")) {
                            jk = true;
                        } else {
                            jk = false;
                        }
                        System.out.print("Usia: ");
                        int usia = sc.nextInt();
                        sc.nextLine();

                        Dosen15 d = new Dosen15(kd, nm, jk, usia);
                        list.tambah(d);

                        System.out.println("----------------------------------------");
                    }
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data diurutkan ASC (termuda → tertua)");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data diurutkan DSC (tertua → termuda)");
                    list.tampil();
                    break;

                case 5:
                    list.insertionSort();
                    System.out.println("Data diurutkan dengan Insertion Sort");
                    list.tampil();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }
        } while (pilih != 0);
    }
    
}
