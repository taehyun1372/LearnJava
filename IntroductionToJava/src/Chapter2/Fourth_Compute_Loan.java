void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter annual interest rate, e.g., 7.25%: ");
    double annualInterestRate = input.nextDouble();
    System.out.print("Enter loan amount, e.g., 120000.95: ");
    double  loanAmount = input.nextDouble();
    System.out.print("Enter number of years as an integer, e.g., 5: ");
    int numberOfYears = input.nextInt();

    //Calculate total payment
    double totalPayment = loanAmount * Math.pow((1 + annualInterestRate/100), numberOfYears);
    double monthlyPayment = totalPayment/(numberOfYears * 12);
    System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
    System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);


    double monthlyInterestRate = annualInterestRate / 1200;

}