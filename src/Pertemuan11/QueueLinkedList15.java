public class QueueLinkedList15 {
    NodeQueue15 front, rear;
    int size;
    int max = 100; 

    public QueueLinkedList15() {
        front = rear = null;
        size = 0;
    }
    boolean isEmpty() {
        return size == 0;
    }
    boolean isFull() {
        return size == max;
    }
    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue berhasil dikosongkan");
    }
    void enqueue(MahasiswaQL15 data) {
        if (isFull()) {
            System.out.println("Queue penuh");
            return;
        }
        NodeQueue15 newNode = new NodeQueue15(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Data berhasil masuk queue");
    }
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }
        System.out.println("Data keluar:");
        front.data.tampilInformasi();
        front = front.next;
        size--;
        if (front == null) {
            rear = null;
        }
    }
    void peekFront() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            System.out.println("Data terdepan:");
            front.data.tampilInformasi();
        }
    }
    void peekRear() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            System.out.println("Data terakhir:");
            rear.data.tampilInformasi();
        }
    }
    void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
            System.out.println("Isi Queue:");
            NodeQueue15 temp = front;
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }
    }
    void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }
}