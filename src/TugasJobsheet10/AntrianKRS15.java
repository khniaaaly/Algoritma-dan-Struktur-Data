public class AntrianKRS15 {
    MahasiswaT15[] data;
    int front, rear, size;
    int max = 10;
    int jumlahProses = 0;

    public AntrianKRS15() {
        data = new MahasiswaT15[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void enqueue(MahasiswaT15 m) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = m;
        size++;
        System.out.println("Berhasil masuk antrian.");
    }

    public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilData();
            front = (front + 1) % max;
            size--;
            jumlahProses++;
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampilData();
            i = (i + 1) % max;
        }
    }

    public void tampilDepan2() {
        if (size < 2) {
            System.out.println("Kurang dari 2 antrian.");
            return;
        }
        data[front].tampilData();
        data[(front + 1) % max].tampilData();
    }

    public void tampilAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        data[rear].tampilData();
    }

    public void info() {
        System.out.println("Jumlah antrian: " + size);
        System.out.println("Sudah proses: " + jumlahProses);
        System.out.println("Belum proses (maks 30): " + (30 - jumlahProses));
    }
}