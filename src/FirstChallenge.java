public class FirstChallenge {
    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 80.00;
        double sum = num1 + num2 ;
        System.out.println("The sum is :" +sum);
        double isMultiple = sum*100.00;
        System.out.println(isMultiple);
        double isRemainder = isMultiple%40.00;
        System.out.println(isRemainder);
        boolean theRemainder = (isRemainder == 0.00)? true:false;
        System.out.println(theRemainder);
        if (!theRemainder){
            System.out.println("got message");
        }



    }
}
