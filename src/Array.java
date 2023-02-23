import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("i am");
        arr.add("drawing");
        System.out.println(arr);

        arr.add(2, "a picture");
        System.out.println(arr);

        System.out.println("Size of array: " + arr.size());
        System.out.println("Is the array empty? " + arr.isEmpty());

        arr.remove(2);
        System.out.println(arr);
    }
}





