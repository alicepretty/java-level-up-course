public class positiveNumber {
    public static void main(String[] args) {
        int number = 0;
        checkNumber(number);
//        System.out.println(numberIs);

    }

    public static  void  checkNumber(int number){
//        if (number > 0){
//            System.out.println("Number is positive");
//        } else if (number < 0) {
//            System.out.println("Number is negative");
//
//        }
//        else {
//            System.out.println("Number is equal to zero");
//        }

        System.out.println((number>0)?"positive":(number<0)?"negative":"zero");
    }
}
