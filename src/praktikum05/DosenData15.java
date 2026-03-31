public class DosenData15 {
    Dosen15[] listDsn = new Dosen15[5];
    int idx;

    void tambah(Dosen15 d) {
        if (idx < listDsn.length) {
            listDsn[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen15 d : listDsn) {
            if (d != null) {
                d.tampil();
                System.out.println("--------------------------");
            }
        }
    }
    
    //Bubble Sort
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listDsn[j].usia > listDsn[j + 1].usia) {
                    Dosen15 tmp = listDsn[j];
                    listDsn[j] = listDsn[j + 1];
                    listDsn[j + 1] = tmp;
                }
            }
        }
    }

    //Selection Sort
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (listDsn[j].usia > listDsn[max].usia) {
                    max = j;
                }
            }
            Dosen15 tmp = listDsn[max];
            listDsn[max] = listDsn[i];
            listDsn[i] = tmp;
        }
    }

    void insertionSort() { 
        for (int i = 1; i < idx; i++) {
            Dosen15 temp = listDsn[i];
            int j = i - 1;

            while (j >= 0 && listDsn[j].usia > temp.usia) {
                listDsn[j + 1] = listDsn[j];
                j--;
            }
            listDsn[j + 1] = temp;
        }
    }
}
