package reviewClass7;

public class Practice5 {
    String weekday(String day) {
        switch (day) {
            case "monday":
                return "It is lazy day";
            case "tuesday":
                return "It is productive day";
            case "wednesday":
                return "It is gloomy day";
            case "thursday":
                ;
                return "It is exciting day";
            case "friday":
                ;
                return "No work day";
            default:
                return "No correct optin found";
        }
    }


    public static void main(String[] args) {
    Practice5 p =new Practice5();
    String output=p.weekday("friday");
    System.out.println(output);



    }
}