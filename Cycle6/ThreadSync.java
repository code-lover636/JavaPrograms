class Railway {
    public synchronized void acquire(String trainName) {
        System.out.println(trainName + " is on the track.");
        try {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {
            System.out.println("Execution interrupted.");
        }
        System.out.println(trainName + " left track.");
    }
}

class Train implements Runnable {
    String name;
    Railway track;

    public Train(String name, Railway track) {
        this.name = name;
        this.track = track;
    }

    public void run() {
        track.acquire(name);
    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Railway track = new Railway();

        Thread train1 = new Thread(new Train("Train 1", track));
        Thread train2 = new Thread(new Train("Train 2", track));
        train1.start();
        train2.start();
    }
}

