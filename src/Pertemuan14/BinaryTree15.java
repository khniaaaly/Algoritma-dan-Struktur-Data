public class BinaryTree15 {
    NodeT15 root;

    public BinaryTree15() {
        root = null;
    }
    
    public boolean isEmpty() {
        return root == null;
    }

    public void add(MahasiswaTr15 mahasiswa) {
        NodeT15 newNode = new NodeT15(mahasiswa);
        if (root == null) {
            root = newNode;
        } else {
            NodeT15 current = root;
            NodeT15 parent = null;

            while (true) {
                parent = current;

                if (mahasiswa.nama.compareTo(current.mahasiswa.nama) < 0) {
                    current = current.left;

                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;

                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(String nama) {
        NodeT15 current = root;
        while (current != null) {
            int nm = nama.compareTo(current.mahasiswa.nama);

            if (nm == 0) {
                return true;
            } else if (nm > 0) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return false;
    }

    public void cari3IPKTertinggi() {
        MahasiswaTr15[] top = new MahasiswaTr15[3];
        cari3IPKTertinggi(root, top);
        for (int i = 0; i < 3; i++) {
            if (top[i] != null) {
                System.out.println(
                    top[i].nim + " | " + top[i].nama + " | " + top[i].kelas + " | IPK: " + top[i].ipk
                );
            }
        }
    }

    public void cari3IPKTertinggi(NodeT15 node, MahasiswaTr15[] top) {
        if (node != null) {
            cari3IPKTertinggi(node.left, top);

            MahasiswaTr15 mhs = node.mahasiswa;

            if (top[0] == null || mhs.ipk > top[0].ipk) {
                top[2] = top[1];
                top[1] = top[0];
                top[0] = mhs;
            } else if (top[1] == null || mhs.ipk > top[1].ipk) {
                top[2] = top[1];
                top[1] = mhs;
            } else if (top[2] == null || mhs.ipk > top[2].ipk) {
                top[2] = mhs;
            }
            cari3IPKTertinggi(node.right, top);
        }
    }

    public void tampilkanMahasiswaKelas(String kelas) {
        tampilkanMahasiswaKelas(root, kelas);
    }

    public void tampilkanMahasiswaKelas(NodeT15 node, String kelas) {
        if (node != null) {
            tampilkanMahasiswaKelas(node.left, kelas);

            if (node.mahasiswa.kelas.equalsIgnoreCase(kelas)) {
                node.mahasiswa.tampilInformasi();
            } 
            tampilkanMahasiswaKelas(node.right, kelas);
        }
    }

    public void traversePreOrder (NodeT15 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder (NodeT15 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder (NodeT15 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    public NodeT15 getSuccessor (NodeT15 del) {
        NodeT15 successor = del.right;
        NodeT15 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return  successor;
    }

    public void delete (double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        NodeT15 parent = root;
        NodeT15 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right= current.left;
                    }
                }
            } else {
                NodeT15 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void addRekursif(MahasiswaTr15 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    public NodeT15 addRekursif(NodeT15 current, MahasiswaTr15 mahasiswa) {
        if (current == null) {
            return new NodeT15(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }
        return current;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        NodeT15 current = root;
        while (current.left != null) {
            current = current.left;
        }
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        NodeT15 current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    public void tampilMahasiswaIPKdiAtas(NodeT15 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}