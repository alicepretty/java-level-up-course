public class MethodChallenge {
    public static void main(String[] args) {
     String name = "pretty";
     int position = 2;
     displayHighScore(name,position);
     int score = 400;
     CalculatedScore(score);
    }
    public static  void displayHighScore(String name , int position){
        System.out.println("Tim managed to get into position 2 on the high score list");
    }

     public static int CalculatedScore(int score){

        if(score>=1000){
            System.out.println("The result is 1");
        } else if (score>=500 && score<1000) {
            System.out.println("The result is 2");
        } else if (score >=100 && score<500) {
            System.out.println("The result is 3");
            System.out.println("my babies");
        }
        else{
            System.out.println("The result is 4");
        }
         return score;

     }

}

