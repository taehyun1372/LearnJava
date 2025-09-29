import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer for seconds: ");
    int seconds = input.nextInt();

    int minutes = seconds / 60;
    int remainingSeconds = seconds % 60;
    System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");

    //Display Current Time
    long totalMilliseconds = System.currentTimeMillis();
    long totalSeconds = totalMilliseconds / 1000;
    long currentSecond = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    long currentMinute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    long currentHour = totalHours % 24;

    System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
}