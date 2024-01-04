public class MethodOverloading {
    public static void main(String[] args) {
        int inches = 8;
        convertToCentimeters(inches);

    }

    public static double convertToCentimeters(int inches){

        double centimeters = inches*2.54;
        System.out.println(centimeters);

        return centimeters;
    }
    public static double convertToCentimeters(int inches, int feet){

        double centimeters = inches*2.54;
        System.out.println(centimeters);

        return centimeters;
    }
}
