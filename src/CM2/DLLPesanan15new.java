public class DLLPesanan15new {
    NodePesanan15 head;
    NodePesanan15 tail;

    public boolean isEmpty() {
        return head == null;
    }
    public void tambahPesanan(Pesanan15 data) {
        NodePesanan15 newNode = new NodePesanan15(data, null, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void sortingPesanan() {
        if (head == null) {
            return;
        }
        boolean tukar;
        do {
            tukar = false;
            NodePesanan15 current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan15 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }
    public void tampilPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }
        sortingPesanan();
        NodePesanan15 current = head;
        System.out.println("===========================================");
        System.out.println("    LAPORAN PESANAN (URUT NAMA PESANAN)    ");
        System.out.println("===========================================");
        System.out.println("Kode Pesanan\tNama Pesanan\tHarga");
        while (current != null) {
            System.out.println(current.data.kodePesanan + "\t\t" + current.data.namaPesanan + "\t" + current.data.harga);
            current = current.next;
        }
    }
}
