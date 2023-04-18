import java.util.Random;

public class Main {
  public static void main(String[] args) {
    pluralize("fish", 0);
    System.out.println(pluralize( "fish", 0));

    flipNHeads(2);
  }

  public static String pluralize(String word, int count){
    if (count == 0 || count > 1){
      return word + "s";
    } else {
      return word;
    }
  }

  public static void flipNHeads(int num){
    int flips = 0;
    int heads = 0;

    Random random = new Random();


    while (heads < num){
      double coin = random.nextDouble();
      if(coin < 0.5){
        System.out.println("tails");
        heads = 0;
      } else {
        System.out.println("heads");
        heads ++; 
      }

      flips ++;
    }
  System.out.println("It took" + " " + flips + " " + "flips to flip" + " " + num + " " + " heads in a row!");

  }
}