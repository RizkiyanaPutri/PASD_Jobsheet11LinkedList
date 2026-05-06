public class SingleLinkedList21 {
    Node21 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong\n");
        } else {
            System.out.println("Isi Linked List:");
            Node21 temp = head;
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void addFirst(Mahasiswa21 data) {
        Node21 newNode = new Node21(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa21 data) {
        Node21 newNode = new Node21(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(String key, Mahasiswa21 data) {
        Node21 temp = head;
        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                Node21 newNode = new Node21(data, temp.next);
                temp.next = newNode;
                if (temp == tail) tail = newNode;
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Mahasiswa21 data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node21 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node21 newNode = new Node21(data, temp.next);
        temp.next = newNode;

        if (newNode.next == null) tail = newNode;
    }
}