import javax.swing.JOptionPane;

 void main() {
    System.out.println("Welcome to Java!");
    var result = 3.5 * 4 / 2 - 2.5;
    System.out.println(result);
    //system.out.println(resulT); Java is case sensitive

    //Message dialog
    JOptionPane.showMessageDialog(null, "Welcome!");
    JOptionPane.showMessageDialog(null, "Welcome to Java",
            "Display Message", JOptionPane.INFORMATION_MESSAGE);

    //Run time errors
    System.out.println(1/0);
}