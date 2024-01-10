public class SwitchWays {
    public static void main(String[] args) {
        //first way of working switch and it traditional.

        int switchValue =0;
        switch (switchValue){
            case 1 :
                System.out.println("The value is " +switchValue);
                break;
            case 2 :
                System.out.println("The value is" +switchValue);
                break;
            case 3 :
                System.out.println(" value is " +switchValue);
                break;
            default:
                System.out.println("Invalid Value");
        }
        //second way
        String months = "october";
        System.out.println("The month is :" + monthsOfYear(months) );
    }
    public static String monthsOfYear(String months){
        switch (months){
            case "January" :
            case "February":
            case "March":
                return "1st quarter";
            case "May":
            case "June":
            case "July":
                return "2nd quarter";
//                return "bad";
        }
        return "bad";
    }
}
