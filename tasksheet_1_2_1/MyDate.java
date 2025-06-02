package tasksheet_1_2_1;

public class MyDate {
    
    public static void main(String[] args) {
        // Set date1 to January 1st of 1978
        DateTask date1 = new DateTask(1, 1, 1978);
        
        // Set date2 to September 21st of 1984
        DateTask date2 = new DateTask(21, 9, 1984);
        
        System.out.println("Date 1: " + date1.toString());
        System.out.println("Date 2: " + date2.toString());
        
        // Display leap years between 1978 and 1984
        System.out.println("\nLeap years between 1978 and 1984:");
        DateTask.leapYears();
    }
}