abstract class A{

    abstract void callme();

    void callme1(){

        System.out.println("This is concerte method");

    }

}


class B extends A{

    void callme(){

        System.out.println("This is 30");

    }

}


class AbstractTest{

    public static void main(String args[]){

        B obj = new B();

        obj.callme1();
        obj.callme();

    }

}