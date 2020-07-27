import java.text.RuleBasedCollator;

class ThreadclassExample extends Thread {


    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Processing.............");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("OUT PUT.......Null");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Haii implements Runnable {


    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Processing.............");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hoiii implements Runnable {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("OUT PUT.......Null");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class KevalThread {


    public void run() {


        for (int i = 0; i <= 4; i++) {
            System.out.println(" system.sut.down");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

class MiyaniThread extends KevalThread implements Runnable {

    int i;

    public MiyaniThread(int i) {
        this.i = i;
        System.out.println(i);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(" ....RUN...AGAIN....");

    }
}



