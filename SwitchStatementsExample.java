public class SwitchStatementsExample {
    public static void main(String[] args) {
        // Example using switch statement
        int dayOfWeek = 3;
        String dayName;

        System.out.println("Example using switch statement:");
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day of the week: " + dayName);

        // Example with fall-through behavior
        int month = 3;
        String monthName;

        System.out.println("\nExample with fall-through behavior:");
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthName = "31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                monthName = "30 days";
                break;
            case 2:
                monthName = "28 or 29 days";
                break;
            default:
                monthName = "Invalid month";
        }

        System.out.println("Month: " + monthName);
    }
}
