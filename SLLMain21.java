public class SLLMain21 {
    public static void main(String[] args) {

        SingleLinkedList21 list = new SingleLinkedList21();

        Mahasiswa21 m1 = new Mahasiswa21("21212203", "Dirga", "4D", 3.6);
        Mahasiswa21 m2 = new Mahasiswa21("23212201", "Bima", "2B", 3.8);
        Mahasiswa21 m3 = new Mahasiswa21("22212202", "Cintia", "3C", 3.5);
        Mahasiswa21 m4 = new Mahasiswa21("24212200", "Alvaro", "1A", 4.0);

        list.addLast(m1);
        list.addLast(m2);
        list.addLast(m3);
        list.addLast(m4);

        System.out.println("Isi Linked List:");
        list.print();

        System.out.println("Index data Cintia: " + list.indexOf("22212202"));

        System.out.println("Data pada index ke-2:");
        list.getData(2).tampil();
        System.out.println();

        System.out.println("Hapus data pertama:");
        list.removeFirst();
        list.print();

        System.out.println("Hapus data terakhir:");
        list.removeLast();
        list.print();

        System.out.println("Hapus data (Bima):");
        list.remove("23212201");
        list.print();

        System.out.println("Hapus data index ke-0:");
        list.removeAt(0);
        list.print();
    }
}