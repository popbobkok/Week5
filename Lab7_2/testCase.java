
/*
    Name : Natthapong Tung-uan
    Student ID : 632115019
    Class : SE
.
.
.
    Work : LAB 7-2 encapsulation2
*/

import java.util.Scanner;

public class testCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        circle c1, c2, c3, c4, c5, c6, ANS1, ANS2, ANS3;
        double getR = 0, getRr = 0, getO1 = 0, getO2 = 0, get11 = 0, get22 = 0;
        c1 = new circle(0.0, 0.0, 2.0, "Circle 1 ");
        c2 = new circle(1.0, 2.0, 3.0, "Circle 2 ");
        c3 = new circle(3.0, 5.0, 1.0, "Circle 3 ");
        c4 = new circle(-1.0, -10.0, -1.0, "Circle 4 ");

        c1.getAr();
        c1.getCir();

        c2.getAr();
        c2.getCir();

        c3.getAr();
        c3.getCir();

        c4.getAr();
        c4.getCir();

        // ----------------------------------------------------------------------------

        System.out.println("\nUser Circle 1 : input two origin point.");
        getO1 = input.nextDouble();
        getO2 = input.nextDouble();

        System.out.println("You want to input Radius? (1 = yes // 0 = no)");
        int choice = input.nextInt();

        if (choice == 1) {
            getR = input.nextDouble();
        } else {
            getR = 1;
        }
        // c5 = new circle(getO1, getO2, getR, "Circle User 1 ");

        // ----------------------------------------------------------------------------

        System.out.println("User Circle 2 : input two origin point.");
        get11 = input.nextDouble();
        get22 = input.nextDouble();

        System.out.println("You want to input Radius? (1 = yes // 0 = no)");
        int choice2 = input.nextInt();

        if (choice2 == 1) {
            getRr = input.nextDouble();
        } else {
            getRr = 1;
        }

        // c6 = new circle(get11, get22, getRr, "Circle User 2 ");

        // ----------------------------------------------------------------------------

        // ANS1 = new circle(c1.getD(), c2.getD());
        // ANS2 = new circle(c1.getD(), c3.getD());

        c5 = new circle(getO1, getO2, getR, "Circle User 1 ");

        c6 = new circle(get11, get22, getRr, "Circle User 2 ");

        c5.getAr();
        c5.getCir();

        c6.getAr();
        c6.getCir();

        ANS3 = new circle(getO1, getO2, getR, get11, get22, getRr);

    }
}
