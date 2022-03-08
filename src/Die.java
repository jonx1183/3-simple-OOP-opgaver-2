import java.util.Random;

public class Die {

  int faceValue;
  int ones = 0;
  int twoes = 0;
  int trees = 0;
  int fours = 0;
  int fives = 0;
  int sixes = 0;

  public int roll() {

    for (int i = 0; i < 100; i++) {
      Random diceRolle = new Random();
      faceValue = 0;
      faceValue = diceRolle.nextInt(6) + 1;

      if (faceValue == 1){
        ones++;
      }
      else if (faceValue == 2){
        twoes++;
      }
      else if (faceValue ==3){
        trees++;
      }
      else if(faceValue == 4){
        fours++;
      }
      else  if (faceValue ==5){
        fives++;
      }
      else if (faceValue == 6){
        sixes++;
      }

      //System.out.println(faceValue);

    }
    return faceValue;
  }

  public int get (){
    roll();

    return faceValue;
  }

  Die(){
    get();
  }

  @Override
  public String toString() {
    return "Die{" +
        "faceValue=" + faceValue +
        '}';
  }
}
