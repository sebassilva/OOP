public class ArrayOperations{
  public static void main(String[] args) {
    String[] names = new String[3];
    names[0] = "Blue Shirt";
    names[1] = "Red Shirt";
    names[2] = "Black Shirt";

    int[] numbers = {23, 34, 54};
    for (String name: names){
      System.out.println("Name: " +name);
    }
    for (int number: numbers){
      System.out.println("Number: " + number);
    }
  }
}
