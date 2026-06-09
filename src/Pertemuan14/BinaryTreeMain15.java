public class BinaryTreeMain15 {
    public static void main(String[] args) {
        BinaryTree15 bst = new BinaryTree15();

        bst.add(new MahasiswaTr15("220101001", "Andi", "TI-1A", 3.95));
        bst.add(new MahasiswaTr15("220101002", "Budi", "TI-1A", 3.20));
        bst.add(new MahasiswaTr15("220101003", "Sinta", "TI-1B", 3.82));
        bst.add(new MahasiswaTr15("220101004", "Rina", "TI-1B", 3.45));
        bst.add(new MahasiswaTr15("220101005", "Dimas", "TI-1C", 2.75));
        bst.add(new MahasiswaTr15("220101006", "Fajar", "TI-1C", 3.10));
        bst.add(new MahasiswaTr15("220101007", "Nabila", "TI-1D", 3.76));
        bst.add(new MahasiswaTr15("220101008", "Rizky", "TI-1D", 3.50));
        bst.add(new MahasiswaTr15("220101009", "Aulia", "TI-1E", 3.88));
        bst.add(new MahasiswaTr15("220101010", "Kevin", "TI-1E", 3.00));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa berdasarkan nama:");
        System.out.print("Cari mahasiswa dengan nama: Rina : ");
        String hasilCari = bst.find("Rina") ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);
        System.out.print("Cari mahasiswa dengan nama: Nana : ");
        hasilCari = bst.find("Nana") ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);
        
        System.out.println("\nMahasiswa dengan IPK tertinggi (3 Mahasiswa):");
        bst.cari3IPKTertinggi();

        System.out.println("\nPencarian mahasiswa dari kelas tertentu:");
        bst.tampilkanMahasiswaKelas("TI-1A");
        
        System.out.println("\nInOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal)");
        bst.traverseInOrder(bst.root);

        System.out.println("\nMahasiswa dengan IPK terkecil:");
        bst.cariMinIPK();
        System.out.println("\nMahasiswa dengan IPK terbesar:");
        bst.cariMaxIPK();
        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
}