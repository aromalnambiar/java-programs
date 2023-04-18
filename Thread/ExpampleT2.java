class ThreadExample implements Runnable{

    Thread t;

    public ThreadExample(String threadname){

        t = new Thread(this,threadname);

    }

    public void run(){

        System.out.println(Thread.currentThread());

        for(int i = 0; i <= 5 ; i++)

        System.out.println(i);

    }

    

}


public class ExpampleT2{

            public static void main(String args[]){

                    Thread obj = new Thread("First");

                    obj.t.start();

                    System.out.println("This is " + Thread.currentThread());

                }
    }