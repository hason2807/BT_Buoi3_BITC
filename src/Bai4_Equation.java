public class Bai4_Equation {
    public void calculateQuadratic(int a, int b, int c) {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (a == 0) {
            double x = (double) -c / b;
            System.out.println("Phuong trinh co mot nghiem la x = " + x);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}