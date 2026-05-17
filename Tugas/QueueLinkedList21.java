package Tugas;

public class QueueLinkedList21 {
    Node21 front;
    Node21 rear;
    int size;
    int max;

    public QueueLinkedList21(int max) {
        this.max = max;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan\n");
    }

    // tambah antrian
    public void enqueue(Mahasiswa21 data) {
        if (isFull()) {
            System.out.println("Antrian penuh!\n");
            return;
        }
        Node21 newNode = new Node21(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data.nama + " berhasil masuk antrian\n");
    }
    // panggil antrian
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!\n");
            return;
        }
        System.out.println("Memanggil antrian:");
        front.data.tampilData();
        front = front.next;
        size--;
        if (front == null) {
            rear = null;
        }
        System.out.println();
    }

    // tampil semua
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong\n");
            return;
        }
        System.out.println("Daftar Antrian:");
        System.out.println("NIM          Nama            Jurusan");
        Node21 temp = front;
        while (temp != null) {
            temp.data.tampilData();
            temp = temp.next;
        }
        System.out.println();
    }
    // antrian depan
    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
            System.out.println();
        }
    }

    // antrian belakang
    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian paling akhir:");
            rear.data.tampilData();
            System.out.println();
        }
    }

    // jumlah antrian
    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang mengantre: " + size + "\n");
    }
}