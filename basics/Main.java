import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    pluralize("fish", 0);
    System.out.println(pluralize( "fish", 0));

    flipNHeads(2);
    clock();
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

  public static void clock(){
    LocalDateTime currentTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String formattedTime = formatter.format(currentTime);
    System.out.println(formattedTime);

    while(true) {
      LocalDateTime newTime = LocalDateTime.now();
      String newFormattedTime = formatter.format(newTime);
      if (!newFormattedTime.equals(formattedTime)) {
        System.out.println(newFormattedTime);
        formattedTime = newFormattedTime;
      }
    }
  }
}