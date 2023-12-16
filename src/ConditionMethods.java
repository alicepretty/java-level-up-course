public class ConditionMethods {
    public static void main(String[] args) {
        String firstName = "Mud";
        isBig(firstName);
        boolean gameover = true;
        int score = 20;
        int levelOne = 10;
        int bonus = 40;
        System.out.println(calculateScore(gameover,score,levelOne,bonus));


    }

    public static void isBig(String name){
         String isUrName = (name == "Mud")? "true":"false";
        System.out.println("your Name is :" +isUrName);
    }
    public static int calculateScore(boolean gameover , int score , int levelOne , int bonus){
        int finalScore = score;
        if (gameover){
            finalScore += score+levelOne*bonus;
//            System.out.println(finalScore);
        }
        return finalScore;
    }
}
