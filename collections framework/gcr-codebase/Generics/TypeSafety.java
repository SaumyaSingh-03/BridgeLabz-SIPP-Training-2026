package Generics;
import java.util.ArrayList;

public class TypeSafety {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Sneha");

        String name = list.get(0);

        System.out.println(name);
    }
}