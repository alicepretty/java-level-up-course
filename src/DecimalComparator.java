public class DecimalComparator {
    public static void main(String[] args) {
        double num1 = 175.01399;
        double num2 = 175.5;
        boolean threeDecimals = areEqualByThreeDecimalPlaces(num1,num2);
        System.out.println(threeDecimals);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
        double rounded1 = Math.round(num1*1000)/1000;
        double rounded2=Math.round(num2*1000)/1000;
        if (rounded1 == rounded2) {
            return true;

        }
        else {
            return false;
        }
    }
}
