void main() {
    final double PI  = 3.14159;
    final int SIZE = 20;

    System.out.print("Enter a number for radius: ");
    Scanner input = new Scanner(System.in);
    double radius = input.nextDouble();
    double area = radius * radius * PI;

    System.out.println("The area for the circle of radios " + radius + " is " + area);

    //Compute average
    System.out.print("Enter three numbers: ");

    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();

    double average = (number1 + number2 + number3)/ 3;

    System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " " + " is " + average);

    //Variables
    int interstRate = 5;
    interstRate = 11;
    System.out.println(interstRate);

    double miles = 100;
    final double KILOMETERS_PER_MILE = 1.609;
    double kilometers = miles * KILOMETERS_PER_MILE;
    System.out.println(kilometers);

    int inMaxNumber =  2147483647;
    inMaxNumber += 1;
    System.out.println(inMaxNumber);

    int inMinNumber =  -2147483648;
    inMinNumber -= 1;
    System.out.println(inMinNumber);


}