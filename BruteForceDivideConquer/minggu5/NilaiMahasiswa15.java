package BruteForceDivideConquer.minggu5;

public class NilaiMahasiswa15 {
    public static Mahasiswa15 utsTertinggi(Mahasiswa15[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l];
        }
        int mid = (l + r) / 2;

        Mahasiswa15 kiri = utsTertinggi(mhs, l, mid);
        Mahasiswa15 kanan = utsTertinggi(mhs, mid + 1, r);

        if (kiri.nilaiUTS > kanan.nilaiUTS) {
            return kiri;
        } else {
            return kanan;
        }
    }

    public static Mahasiswa15 utsTerendah(Mahasiswa15[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l];
        }
        int mid = (l + r) / 2;

        Mahasiswa15 kiri = utsTerendah(mhs, l, mid);
        Mahasiswa15 kanan = utsTerendah(mhs, mid + 1, r);

        if (kiri.nilaiUTS < kanan.nilaiUTS) {
            return kiri;
        } else {
            return kanan;
        }
    }

    public static double rataUAS(Mahasiswa15[] mhs) {
        double total = 0;

        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS;
        }
        return (double) total / mhs.length;
    }
}
