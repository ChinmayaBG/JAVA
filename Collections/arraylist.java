import java.util.ArrayList;

public class arraylist{
    public static void main(String[] args) {
      //Creating an Array List
      ArrayList<String> names = new ArrayList<>();
      //Adding elements
      names.add("Zuzu");
      names.add("BG");
      names.add("Chandu");

      System.out.println(names);
      //Accessing elements
      String firstName = names.get(0);
      System.out.println(firstName);
      //Updating elements
      names.set(1, "Chinmaya");
      System.out.println(names);
    }
}