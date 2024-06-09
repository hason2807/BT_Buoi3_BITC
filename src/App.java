import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     // Kiễm tra năm nhuận
        Bai1_CheckYear checkYear = new Bai1_CheckYear();
        checkYear.CheckLeapYear(2020);
        checkYear.CheckLeapYear(2013);
        checkYear.CheckLeapYear(1000); 
     // Viết App Calculator
        Bai2_Calculator calculator = new Bai2_Calculator();
        calculator.calculate('+', 4, 2);
        calculator.calculate('-', 4, 2);
        calculator.calculate('*', 4, 2);
        calculator.calculate('/', 4, 2);
        calculator.calculate('%', 4, 2);
        calculator.calculate('^', 4, 2);
    //   Tìm số nguyên lớn nhất

    Scanner scanner = new Scanner(System.in);
    Bai3_MaxInteger maxInteger = new Bai3_MaxInteger();

    System.out.println("Please enter the first number:");
    int number1 = scanner.nextInt();

    System.out.println("Please enter the second number:");
    int number2 = scanner.nextInt();

    System.out.println("Please enter the third number:");
    int number3 = scanner.nextInt();

    int max = maxInteger.findMaxInteger(number1, number2, number3);
    System.out.println("The largest number is: " + max);

    scanner.close();
    // Tìm nghiệm phương trình bậc 2
    Bai4_Equation equation = new Bai4_Equation();
        equation.calculateQuadratic(4, 5, 6); // Pt vo nghiem
        equation.calculateQuadratic(1, 2, 1); // Phuong trinh co nghiem duy nhat x = -1.0
        equation.calculateQuadratic(0, 5, 6); // Phuong trinh co mot nghiem la x = -1.2
        equation.calculateQuadratic(0, 0, 6); // Phuong trinh vo nghiem
        equation.calculateQuadratic(0, 0, 0); // Phuong trinh vo so nghiem
        equation.calculateQuadratic(4, 8, 3); // Phuong trinh co 2 nghiem x1 = 0.5, x2 = -1.0

    
}
}
