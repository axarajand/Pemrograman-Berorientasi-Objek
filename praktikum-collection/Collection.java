import java.util.ArrayList;
import java.util.ArrayDeque;

public class Collection {
    public static void main(String[] args) {
        // Contoh penggunaan ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("Isi ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Contoh penggunaan ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);

        System.out.println("\nIsi ArrayDeque:");
        for (int number : arrayDeque) {
            System.out.println(number);
        }
    }
}
