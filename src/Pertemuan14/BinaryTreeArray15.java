public class BinaryTreeArray15 {
    MahasiswaTr15[] dataMahasiswaTr15s;
    int idxLast;

    public BinaryTreeArray15() {
        this.dataMahasiswaTr15s = new MahasiswaTr15[10];
    }

    public void populateData (MahasiswaTr15 dataMhs[], int idxLast) {
        this.dataMahasiswaTr15s = dataMhs;
        this.idxLast = idxLast;
    }

    public void traverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswaTr15s[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswaTr15s[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    public void add(MahasiswaTr15 data) {
        if (idxLast < dataMahasiswaTr15s.length - 1) {
            idxLast++;
            dataMahasiswaTr15s[idxLast] = data;
        } else {
            System.out.println("Array penuh");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswaTr15s[idxStart] != null) {
                dataMahasiswaTr15s[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }         
    }
}
