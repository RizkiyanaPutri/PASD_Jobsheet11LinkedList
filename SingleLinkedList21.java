public class SingleLinkedList21 {
    Node21 head, tail;

    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
    if (isEmpty()) {
        System.out.println("Linked List kosong\n");
    } else {
        Node21 temp = head;
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
        System.out.println();
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
    public int indexOf(String nim) {
        Node21 temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data.nim.equals(nim)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    public Mahasiswa21 getData(int index) {
        Node21 temp = head;

        for (int i = 0; i < index; i++) {
            if (temp == null) return null;
            temp = temp.next;
        }
        return temp.data;
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node21 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(String nim) {
        if (isEmpty()) return;

        if (head.data.nim.equals(nim)) {
            removeFirst();
            return;
        }
        Node21 temp = head;
        while (temp.next != null) {
            if (temp.next.data.nim.equals(nim)) {
                temp.next = temp.next.next;

                if (temp.next == null) {
                    tail = temp;
                }
                break; // penting!
            }
            temp = temp.next;
        }
    }
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node21 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }
}