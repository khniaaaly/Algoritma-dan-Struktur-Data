public class DLLPembeli15new {
    NodePembeli15new head;
    NodePembeli15new tail;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }
    public void tambahAntrian(Pembeli15new data) {
        NodePembeli15new newNode = new NodePembeli15new(data, null, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
     public void tambahAntrianPrioritas (String key, Pembeli15 data) {
        NodePembeli15new current = head;
        while (current != null && !current.data.equals(key)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + key + " tidak ditemukan.");
            return;
        }
        NodePembeli15new newNode = new NodePembeli15new(data, null, null);

        if(current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + key);
    }
    public Pembeli15new hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Pembeli15new data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return data;
    }
    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        NodePembeli15new current = head;
        System.out.println("============================================");
        System.out.println("           Daftar Antrian Pembeli           ");
        System.out.println("============================================");
        System.out.println("No Antrian\tNama\t\tNo HP");
        while (current != null) {
            System.out.println(current.data.noAntrian + "\t\t" + current.data.namaPembeli + "\t\t" + current.data.noHp);
            current = current.next;
        }
    }
}
