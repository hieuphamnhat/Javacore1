import java.util.*;

public class SomeCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(3);
        linkedList.add(9);

        System.out.println("linkedList: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + "\t");
        }
        System.out.println("Enter the index: ");
        int index = scanner.nextInt();
        if ((index < 0) || (index > (linkedList.size() - 1))) {
            System.out.println("Index need to be bigger than 0 and smaller than " + (linkedList.size() - 1));
        } else {
            int node = linkedList.get(index);
            System.out.println("Element with index: " + index + " is:  " + node);
        }
        int firstNode = linkedList.getFirst();
        int lastNode = linkedList.getLast();
        System.out.println("\nFirst " + firstNode + " End of LinkedList  " + lastNode);

        ArrayList<Double> arrListDouble = new ArrayList<>(10);

        arrListDouble.add(8.329d);
        arrListDouble.add(1.02d);
        arrListDouble.add(2.9d);
        arrListDouble.add(20.17d);

        System.out.println("arrListDouble: ");
        System.out.println(arrListDouble);
        arrListDouble.set(2, 11.1d);
        arrListDouble.remove(1);
        System.out.println(arrListDouble);

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("CSLT", "Cơ sở lập trình");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");

        System.out.println("hashMap:");
        System.out.println(hashMap);
        System.out.println("Key của các entry trong hashMap: ");
        for (String key : hashMap.keySet()) {
            System.out.println("Key = " + key);
        }
        System.out.println("Các value có trong hashMap là: ");
        for (String value : hashMap.values()) {
            System.out.println("Value = " + value);
        }
        scanner.close();
    }
}
