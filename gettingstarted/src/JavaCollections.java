import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
//        arraylist();
//        linkedlist();
//        hashset();
//        deques();
        hashmap();
    }

    static void arraylist() {
        ArrayList<String> todoitemlist = new ArrayList<>();
        todoitemlist.add("Study");
        todoitemlist.add("prep dinner");
        todoitemlist.set(0, "Program & study");
        System.out.println(todoitemlist);
        System.out.println(todoitemlist.size());
        System.out.println(todoitemlist.contains("din"));
        System.out.println(todoitemlist.indexOf("prep dinner"));
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        numbers.removeAll(List.of(4, 7));
        numbers.remove(1);
        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());
        numbers.sort(Comparator.reverseOrder());
        numbers.clear();
        System.out.println(numbers.isEmpty());

    }

    static void linkedlist() {
        LinkedList<Integer> todoitemslinkedlist = new LinkedList<>();
        todoitemslinkedlist.add(70);
        todoitemslinkedlist.add(80);
        todoitemslinkedlist.add(10);
        System.out.println(todoitemslinkedlist.get(2));
        todoitemslinkedlist.addFirst(90);
        todoitemslinkedlist.addLast(100);
        todoitemslinkedlist.push(500);
        System.out.println(todoitemslinkedlist);
        todoitemslinkedlist.pop();
        System.out.println(todoitemslinkedlist);
        System.out.println(todoitemslinkedlist.peekFirst());
        System.out.println(todoitemslinkedlist.peekLast());
    }

    static void hashset() {
        HashSet<String> books = new HashSet<>();
        books.add("a");
        books.add("b");
        books.add("c");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println(books.contains("c"));
        books.remove("b");
        System.out.println(books.size());
        books.clear();
        System.out.println(books.isEmpty());
    }

    static void deques() {
        ArrayDeque<String> cards = new ArrayDeque<>();
        //can only access items at the begining or end of deque
        cards.add("King");
        cards.add("Queen"); //by default adds to last
        cards.addFirst("Jack");
        System.out.println(cards.getFirst());
        cards.removeFirst();
        System.out.println(cards.peekFirst());
        System.out.println(cards.contains("Sou"));

    }

    static void hashmap() {
        HashMap<String, String> abbs = new HashMap<>();
        abbs.put("California", "CA");
        abbs.put("Ohio", "Oh");
        abbs.put("Delhi", "DL");
        System.out.println(abbs.get("Delhi"));
        System.out.println(abbs.containsKey("Mumbai"));
        System.out.println(abbs.containsValue("Oh"));
        abbs.putIfAbsent("Goa","Go");
        abbs.remove("Ohio");
        System.out.println(abbs);
//        System.out.println(abbs.size());
    }
}
