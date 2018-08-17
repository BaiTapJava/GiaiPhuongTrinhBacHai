import java.util.Scanner;

public class PhuongTrinhBacHai {

    public static void main(String[] args) {
	// write your code here
        System.out.println("------ Ung dung tinh giai phuong trinh bac hai -----");

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao so thu nhat la: ");
        float a = input.nextFloat();

        System.out.println("Nhap vao so thu hai la: ");
        float b = input.nextFloat();

        System.out.println("Nhap vao so thu ba la: ");
        float c = input.nextFloat();


        float delta = b * b - 4 * a * c;
        float x1;
        float x2;

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem ");
            } else {
                System.out.println("Phuong trinh co 1 nghiem la: " + " x =" + (-b/a));
            }
        }

        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));

            System.out.println("Phuong trinh co 2 nghiem la: " + x1 + " va x2 =" + x2);
        } else if (delta == 0) {
            x1 = (-b / (2*a));
            System.out.println("Phuong trinh co nghiem duy nhat la: " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem ");
        }

    }
}
