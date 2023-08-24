import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class demo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("HN");
        linkedList.add("SG");
        linkedList.add("DN");
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+ " ");
        }
    }
}
