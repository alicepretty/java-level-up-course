public class ExercisesMethod {

    public static void main(String[] args) {
        String name = "aline";
        int position = 4;
        displayHighScore(name,position);

        int score=100 ;
        int calcu = calculateScore(score);
        System.out.println(calcu);
        System.out.println(name +" "+ "managed to get into " + calcu);

    }

    public static void  displayHighScore(String name , int position){
//        System.out.println("Tim managed to get into position 2");

    }

    public static int calculateScore(int score){
        int positions = 0;
        if(score>=1000){
            positions = 1;
        }
        else if(score>=500 && score<1000){
            positions= 2;
        }
        else if(score>=100 && score<500){
            positions = 3;
        }
        else {
            positions = 4;
        }
        return positions;
    }
}
