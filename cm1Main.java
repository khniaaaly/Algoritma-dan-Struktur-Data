import java.util.Scanner;

public class cm1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        Mahasiswacm15[] daftarMhs = {
            new Mahasiswacm15("22001", "Andi", "Teknik Informatika"),
            new Mahasiswacm15("22002", "Budi", "Teknik Informatika"),
            new Mahasiswacm15("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Bukucm15[] daftarBuku = {
            new Bukucm15("B001", "Algoritma", 2020),
            new Bukucm15("B002", "Basis Data", 2019),
            new Bukucm15("B003", "Pemrograman", 2021),
            new Bukucm15("B004", "Fisika", 2024)
        };

        Peminjamancm15[] daftarPmnjmn = {
            new Peminjamancm15(daftarMhs[0], daftarBuku[0], 7),
            new Peminjamancm15(daftarMhs[1], daftarBuku[1], 3),
            new Peminjamancm15(daftarMhs[2], daftarBuku[2], 10),
            new Peminjamancm15(daftarMhs[2], daftarBuku[3], 6),
            new Peminjamancm15(daftarMhs[0], daftarBuku[1], 4)
        };

        do { 
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 :
                    System.out.println("Daftar Mahasiswa: ");
                    for (Mahasiswacm15 m : daftarMhs) m.tampilMahasiswa();
                    break;
                case 2 : 
                    System.out.println("Daftar Buku: ");
                    for (Bukucm15 b : daftarBuku) b.tampilBuku();
                    break;
                case 3 :
                    System.out.println("Data Peminjaman: ");
                    for (Peminjamancm15 p : daftarPmnjmn) p.tampilPeminjaman();
                    break;
                case 4 :
                    for (int i = 1; i < daftarPmnjmn.length; i++) {
                        Peminjamancm15 temp = daftarPmnjmn[i];
                        int j = i - 1;
                        while (j >= 0 && daftarPmnjmn[j].denda < temp.denda) {
                            daftarPmnjmn[j + 1] = daftarPmnjmn[j];
                            j--;
                        }
                        daftarPmnjmn[j + 1] = temp;
                    }
                    System.out.println("Setelah diurutkan (Denda terbesar): ");
                    for (Peminjamancm15 p : daftarPmnjmn) p.tampilPeminjaman();
                    break;
                case 5 :
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();

                    for (int i = 1; i < daftarPmnjmn.length; i++) {
                        Peminjamancm15 temp = daftarPmnjmn[i];
                        int j = i -1;
                        while (j >= 0 && daftarPmnjmn[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                            daftarPmnjmn[j + 1] = daftarPmnjmn[j];
                            j--;
                        }
                        daftarPmnjmn[j + 1] = temp;
                    }
                                        int left = 0, right = daftarPmnjmn.length - 1;
                    boolean ketemu = false;

                    while (left <= right) {
                        int mid = (left + right) / 2;
                        int cmp = daftarPmnjmn[mid].mhs.nim.compareTo(nim);

                        if (cmp == 0) {
                            System.out.println("Data ditemukan:");
                            daftarPmnjmn[mid].tampilPeminjaman();
                            ketemu = true;
                            break;
                        } else if (cmp < 0) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
            }        
        } while (pilih !=0);
    }  
}
