public class Bai2_Calculator {
    public void calculate(char operation, int number1, int number2) {
        int result = 0;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Khong the chia cho 0");
                    return;
                }
                result = number1 / number2;
                break;
            case '%':
                if (number2 == 0) {
                    System.out.println("Khong the chia cho 0");
                    return;
                }
                result = number1 % number2;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
                break;
            default:
                System.out.println("Phep toan khong hop le");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
        }
    }
}

