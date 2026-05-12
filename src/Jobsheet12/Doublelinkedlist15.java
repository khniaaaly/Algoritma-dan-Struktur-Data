public class Doublelinkedlist15 {
    NodeDDL15 head;
    NodeDDL15 tail;

    public Doublelinkedlist15() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(MahasiswaDDL15 data) {
        NodeDDL15 newNode = new NodeDDL15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(MahasiswaDDL15 data) {
        NodeDDL15 newNode = new NodeDDL15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAfter (String keyNim, MahasiswaDDL15 data) {
        NodeDDL15 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        NodeDDL15 newNode = new NodeDDL15(data);

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
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List maasih kosong.");
            return;
        }
        NodeDDL15 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }
        NodeDDL15 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        } 
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kososng.");
            return;
        } 
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}
