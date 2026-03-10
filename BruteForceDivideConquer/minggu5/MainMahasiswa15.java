package BruteForceDivideConquer.minggu5;

public class MainMahasiswa15 {
    public static void main(String[] args) {

        Mahasiswa15[] data = {
                new Mahasiswa15("Ahmad", "220101001", 2022, 78, 82),
                new Mahasiswa15("Budi", "220101002", 2022, 85, 88),
                new Mahasiswa15("Cindy", "220101003", 2021, 90, 87),
                new Mahasiswa15("Dian", "220101004", 2021, 76, 79),
                new Mahasiswa15("Eko", "220101005", 2023, 92, 95),
                new Mahasiswa15("Fajar", "220101006", 2020, 88, 85),
                new Mahasiswa15("Gina", "220101007", 2023, 80, 83),
                new Mahasiswa15("Hadi", "220101008", 2020, 82, 84)
        };

        Mahasiswa15 tertinggi = NilaiMahasiswa15.utsTertinggi(data, 0, data.length - 1);
        Mahasiswa15 terendah = NilaiMahasiswa15.utsTerendah(data, 0, data.length - 1);
        double rata = NilaiMahasiswa15.rataUAS(data);

        System.out.println("=======================================");
        System.out.println("     HASIL ANALISIS DATA MAHASISWA     ");
        System.out.println("=======================================");
        System.out.println("\nNilai UTS Tertinggi: ");
        System.out.println("Nama       : " + tertinggi.nama);
        System.out.println("NIM        : " + tertinggi.nim);
        System.out.println("Tahun Masuk: " + tertinggi.tahunMasuk);
        System.out.println("Nilai UTS  : " + tertinggi.nilaiUTS);
        System.out.println("---------------------------------------");
        System.out.println("Nilai UTS Terendah: ");
        System.out.println("Nama       : " + terendah.nama);
        System.out.println("NIM        : " + terendah.nim);
        System.out.println("Tahun Masuk: " + terendah.tahunMasuk);
        System.out.println("Nilai UTS  : " + terendah.nilaiUTS);
        System.out.println("---------------------------------------");
        System.out.println("Rata-rata Nilai UAS : " + rata);
    }

}
