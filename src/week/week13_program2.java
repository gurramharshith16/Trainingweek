package week;

class Buffer {
    int item;
    boolean available = false;
    synchronized void produce(int value) {
        while (available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        item = value;
        available = true;
        System.out.println("Produced: " + item);
        notify();
    }
    synchronized int consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        available = false;
        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}
class Producer extends Thread {
    Buffer buffer;
    Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
        }
    }
}
class Consumer extends Thread {
    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
        }
    }
}
public class week13_program2 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);
        p.start();
        c.start();
    }
}
