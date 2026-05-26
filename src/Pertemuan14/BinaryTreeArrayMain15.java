public class BinaryTreeArrayMain15 {
    public static void main(String[] args) {
        BinaryTreeArray15 bta = new BinaryTreeArray15();
        MahasiswaTr15 mhs1 = new MahasiswaTr15("2441601212", "Ali", "A", 3.57);
        MahasiswaTr15 mhs2 = new MahasiswaTr15("2441601185", "Candra", "C", 3.41);
        MahasiswaTr15 mhs3 = new MahasiswaTr15("2441601221", "Badar", "B", 3.75);
        MahasiswaTr15 mhs4 = new MahasiswaTr15("2441601220", "Dewi", "B", 3.35);

        MahasiswaTr15 mhs5 = new MahasiswaTr15("2441601131", "Devi", "A", 3.48);
        MahasiswaTr15 mhs6 = new MahasiswaTr15("2441601205", "Ehsan", "D", 3.61);
        MahasiswaTr15 mhs7 = new MahasiswaTr15("2441601170", "Fizi", "B", 3.86);

        MahasiswaTr15[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\nPreOrder Traversal Mahasiswa:");
        bta.traversePreOrder(0);
    }
}
