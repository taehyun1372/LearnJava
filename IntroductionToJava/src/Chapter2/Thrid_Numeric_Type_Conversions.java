void main() {
    System.out.println((int)1.7);
    //int result = 1.7; Narrowing is not automatic. It leads to compile error without explicit type casting
    System.out.println((double)1/2);
    System.out.println(1/2);

    int sum = 0;
    sum += 4.5; //This is equivalent to sum = (int)(sum + 4.5);
    System.out.println(sum);

    int i = 1;
    //byte b = i; Again this is narrowing

    Scanner input = new Scanner(System.in);
    System.out.print("Enter purchase amount: ");
    double purchaseAmount = input.nextDouble();

    double tax = purchaseAmount * 0.05;
    System.out.println("Raw sales tax is $" + tax);
    System.out.println("Sales tax is $" + (int)(tax * 100)/100.0);
}