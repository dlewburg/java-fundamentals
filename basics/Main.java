public class Main {
  public static void main(String[] args) {
    System.out.println("Proof of Life");
  }

  public static String pluralize(String word, int count){
    if (count == 0 || count > 1){
      return word + "s";
    } else {
      return word;
    }
  }
}