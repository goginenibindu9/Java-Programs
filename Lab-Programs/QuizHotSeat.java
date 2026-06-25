import java.util.Scanner;

class TimerThread extends Thread {
    public void run() {
        try {
            Thread.sleep(10000); // 10 seconds
            System.out.println("\nTime Up! Quiz Closed.");
            System.exit(0);
        }
        catch (Exception e) {
        }
    }
}

public class QuizHotSeat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quiz Question:");
        System.out.println("What is the capital of India?");

        TimerThread t = new TimerThread();
        t.start();

        System.out.print("Enter your answer within 10 seconds: ");
        String answer = sc.nextLine();

        t.interrupt();

        if (answer.equalsIgnoreCase("Delhi") ||
            answer.equalsIgnoreCase("New Delhi")) {
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Wrong Answer!");
        }

        sc.close();
    }
}

