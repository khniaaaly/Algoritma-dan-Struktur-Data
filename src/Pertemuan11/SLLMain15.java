public class SLLMain15 {
    public static void main(String[] args) {
        SingleLinkedList15 sll = new SingleLinkedList15();

        MahasiswaL15 mhs1 = new MahasiswaL15("24212200", "Alvaro", "1A", 4.0);
        MahasiswaL15 mhs2 = new MahasiswaL15("23212201", "Bimon", "2B", 3.8);
        MahasiswaL15 mhs3 = new MahasiswaL15("22212202", "Cintia", "3C", 3.5);
        MahasiswaL15 mhs4 = new MahasiswaL15("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}