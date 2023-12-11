import java.util.Random;

class NumberGenerator implements Runnable {
    Random random = new Random();
    boolean stop = false;

    public void stop() {
        stop = true;
    }

    public void run() {
        while (!stop) {
            int number = random.nextInt(100);
            System.out.println("Generated Number: " + number);

            if (number % 2 == 0) {
                new Thread(new SquareCalculator(number)).start();
            } 
            else {
                new Thread(new CubeCalculator(number)).start();
            }

            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                System.out.println("Execution Interrupted");
            }
        }
    }
}

class SquareCalculator implements Runnable {
    int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square: " + (number * number));
    }
}

class CubeCalculator implements Runnable {
    int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube: " + (number * number * number));
    }
}

public class MultiThread {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread generatorThread = new Thread(numberGenerator);

        generatorThread.start();

        try {
            Thread.sleep(5000);
        } 
        catch (InterruptedException e) {
            System.out.println("Execution Interrupted");
        }

        numberGenerator.stop();
    }
}
