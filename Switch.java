public class Switch {
    public static void main(String[] args) {
        int week = 3;
        String day;

        switch (week) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid week number";
        }

        System.out.println("Day " + week + " is " + day);
    }
}
