import java.util.Scanner;

public class PenDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter pens per student: ");
        int perPerson = sc.nextInt();

        System.out.print("Enter total number of pens: ");
        int totalPens = sc.nextInt();

        int requiredPens = students * perPerson;

        if (totalPens == requiredPens) {
            System.out.println("Possible");
        } else if (totalPens > requiredPens && totalPens % perPerson == 0) {
            System.out.println("Possible with extra pens");
        } else {
            System.out.println("Impossible");
        }
    }
}
