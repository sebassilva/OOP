public class SwitchStringStatement{
  public static void main(String[] args) {
    String color = "Blue";
    String shirt = "Shirt";

    switch(color){
      case "Blue":
        shirt = "Blue " + "Shirt";
        break;
      case "Red":
        shirt = "Red " + "Shirt";
        break;
      default:
        shirt = "White" + "Shirt";
    }
    System.out.println("Shirt type: " + shirt);
  }
}
