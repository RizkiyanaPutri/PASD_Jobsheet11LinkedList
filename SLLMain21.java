import java.util.Scanner;

public class SLLMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList21 list = new SingleLinkedList21();
        list.print();
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            Mahasiswa21 mhs = new Mahasiswa21(nim, nama, kelas, ipk);
            list.addLast(mhs);
            list.print();
        }
        sc.close();
    }
}