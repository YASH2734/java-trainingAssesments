package day2;



import java.util.ArrayList;

public class ArreylistPosition {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // Insert "Yellow" at index 1
        colors.add(1, "Yellow");

        System.out.println("ArrayList after insertion: " + colors);
    }
}