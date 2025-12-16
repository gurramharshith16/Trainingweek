package week;

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}
class Thread1 extends Thread {
    Table table;
    Thread1(Table table) {
        this.table = table;
    }
    public void run() {
        table.printTable(5);
    }
}
class Thread2 extends Thread {
    Table table;
    Thread2(Table table) {
        this.table = table;
    }
    public void run() {
        table.printTable(10);
    }
}
public class week13_program3 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread1 t1 = new Thread1(table);
        Thread2 t2 = new Thread2(table);
        t1.start();
        t2.start();
    }
}