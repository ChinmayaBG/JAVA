public class multiThreading {
    public static void showHi(){
        for(int i=0; i<100; i++){
            System.out.println("Hi");
        }
    }

    public static void showHello(){
        for(int i=0; i<100; i++){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
      //Runnable is a functional interface which means u have to provide definition of run method
      Runnable task1 = new Runnable() {
        public void run(){
            showHi();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
      };

      Runnable task2 = new Runnable() {
        public void run(){
            showHello();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
      };

      Thread t1 = new Thread(task1);
      Thread t2 = new Thread(task2);

      t2.setPriority(10);

      t1.start();
      t2.start();
    }
}
