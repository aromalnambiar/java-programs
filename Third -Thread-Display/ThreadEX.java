import java.io.*;

class One extends Thread{

    public void run(){

        for( int i = 0; i <= 0 ; i++){

            try{
                Thread.sleep(1000);
            }

            catch(InterruptedException e){

                System.out.println(e);

            }


            System.out.println("Good Morning");

        }

    }

}



class Two extends Thread{

    public void run(){

        for( int i = 0; i <= 0 ; i++){

            try{
                Thread.sleep(2000);
            }

            catch(InterruptedException e){

                System.out.println(e);

            }


            System.out.println("Hello");

        }

    }

}


class Am implements Runnable{

    public void run(){

        for( int i = 0; i <= 0 ; i++){

            try{
                Thread.sleep(3000);
            }

            catch(InterruptedException e){

                System.out.println(e);

            }


            System.out.println("Well Done");

        }

    }

}


class ThreadEX{

    public static void main(String args[]){

        One t1 = new One();
        Two t2 = new Two();

        Am tt = new Am();;


        Thread t3 = new Thread(tt);

        t1.setName("One");
        t2.setName("Two");
        t3.setName("Three");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        Thread r =  Thread.currentThread();


        System.out.println(r);

        t1.start();
        t2.start();
        t3.start();

    }

}