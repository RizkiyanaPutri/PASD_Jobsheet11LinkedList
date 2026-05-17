package Tugas;

public class Mahasiswa21 {
    String nim, nama, jurusan;

    public Mahasiswa21(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.printf("%-12s %-15s %-10s\n", nim, nama, jurusan);
    }
}