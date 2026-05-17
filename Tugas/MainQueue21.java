package Tugas;

import java.util.Scanner;

public class MainQueue21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian: ");
        int max = sc.nextInt();
        sc.nextLine();

        QueueLinkedList21 antrian = new QueueLinkedList21(max);

        int pilih;

        do {
            System.out.println("===== MENU ANTRIAN KEMAHASISWAAN =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Jumlah Mahasiswa Mengantre");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh!\n");
                    } else {
                        System.out.print("NIM      : ");
                        String nim = sc.nextLine();

                        System.out.print("Nama     : ");
                        String nama = sc.nextLine();

                        System.out.print("Jurusan  : ");
                        String jurusan = sc.nextLine();

                        Mahasiswa21 mhs =
                                new Mahasiswa21(nim, nama, jurusan);

                        antrian.enqueue(mhs);
                    }
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.print();
                    break;

                case 4:
                    antrian.peekFront();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia\n");
            }

        } while (pilih != 0);

        sc.close();
    }
}
