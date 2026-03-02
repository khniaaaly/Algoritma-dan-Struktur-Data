package Jobsheet3;

public class DataDosen15 {
    void dataSemuaDosen(Dosen15[] arrayOfDosen) {
        for (Dosen15 d : arrayOfDosen) { // d = variabel sementara
            d.tampilInfo();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen15[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen15 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("----------------------------");
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen15[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen15 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0)
            System.out.println("Rata-rata usia dosen Pria   : " + (totalPria / jmlPria));
        if (jmlWanita > 0)
            System.out.println("Rata-rata usia dosen Wanita : " + (totalWanita / jmlWanita));

        System.out.println("----------------------------");
    }

    void infoDosenPalingTua(Dosen15[] arrayOfDosen) {
        Dosen15 tertua = arrayOfDosen[0];

        for (Dosen15 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.tampilInfo();
    }

    void infoDosenPalingMuda(Dosen15[] arrayOfDosen) {
        Dosen15 termuda = arrayOfDosen[0];

        for (Dosen15 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.tampilInfo();
    }
}
