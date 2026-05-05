public class MahasiswaL15 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public MahasiswaL15() {
    }
    public MahasiswaL15(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
    }   
}