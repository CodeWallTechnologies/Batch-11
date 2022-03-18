package two.controlflow;

public class SwitchStatement {
    public static void main(String[] args) {
        int  a = 6;
        String day = "Friday";
        String str = " is weekday";
        switch (day){
            case "monday":
                System.out.println(day + str);
                System.out.println("something");
                break;
            case "tuesday":
                System.out.println(day + str);
                break;
            case "wednesday":
                System.out.println(day + str);
                break;
            case "thursday":
                System.out.println(day + str);
                break;
            case "Friday":
                System.out.println(day + str);
                break;
            default:
                System.out.println("Weekend");

        }
    }
}


//switch case