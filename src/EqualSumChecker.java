public class EqualSumChecker {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        boolean equalSum = hasEqualSum(num1 , num2 ,num3);
        System.out.println(equalSum);
    }
    public static  boolean hasEqualSum(int num1 , int num2 , int num3){
        int sum = num1 + num2;
        if (sum == num3) {
            return true ;
        }
        else {
            return false;
        }
    }
}
