public class Main {
  public static void main(String[] args) {
    pluralize("fish", 0);
    System.out.println(pluralize( "fish", 0));
  }

  public static String pluralize(String word, int count){
    if (count == 0 || count > 1){
      return word + "s";
    } else {
      return word;
    }
  }

  
}