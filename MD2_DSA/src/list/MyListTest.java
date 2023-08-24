package list;

public class MyListTest {
    public static void main(String[] args) {
        MyList1<Integer> arr = new MyList1<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("Element 1 = " + arr.get(0));
        System.out.println("Element 3 = " + arr.get(2));
        System.out.println("Element 2 = " + arr.get(1));
        System.out.println("Element 4 = " + arr.get(3));
        System.out.println("Element 5 = " + arr.get(5));
    }
}
