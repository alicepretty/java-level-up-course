public class TeenNumberChecker {
    public boolean hasTeen(int num1, int num2, int num3) {
        boolean isTeen= num1 >= 13 && num1 <= 19 || num2>=13 && num2<=19 || num3>=13 && num3<=19;
        return isTeen ;
    }
    public boolean teen(int number){
        boolean aTeen = number >=13 && number<=19;
        return aTeen;
    }

    public static void main(String[] args) {
        TeenNumberChecker teenNum = new TeenNumberChecker();
        boolean anyNumber =teenNum.hasTeen(10,11,9);
        boolean aNumber =teenNum.teen(18);
        if (anyNumber == true) {
            System.out.println("The number is Teen");
        }
        if (aNumber == true){
            System.out.println("It is a teen number");
        }

    }
}