import java.util.Scanner;

class HandshakeCalculator {

    public int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter number of students: ");
            int numberOfStudents = input.nextInt();

            if (numberOfStudents < 0) {
                System.out.println("Invalid input.");
                System.exit(0);
            }

            HandshakeCalculator obj = new HandshakeCalculator();

            int result = obj.calculateHandshakes(numberOfStudents);

            System.out.println("Number of handshakes: " + result);
        }
    }
}