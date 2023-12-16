public class FirstClass {
    public static void main(String[] args) {
        boolean isLogged = true;

   if (isLogged == true)
       System.out.println("She is logged in");
        int grade = 200;
        if(grade >200){
            System.out.println("grade 1");
        }

        //using and operator
        int secondGrade = 120;
        if(grade < secondGrade || grade > 200){
            System.out.println("you are in grade2");
        }
    }


}
