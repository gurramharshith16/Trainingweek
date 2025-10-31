package week;

interface Printable {
    void print();
}
interface Showable {
    void show();
}
class Display implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }
    public void show() {
        System.out.println("Showing...");
    }
}
public class week7_program3 {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.print();
        obj.show();
    }
}
