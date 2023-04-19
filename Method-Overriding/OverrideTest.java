class Super{

    int x;

    Super(int x){

        this.x = x;

    }


    public void display(){

        System.out.println("Super x is " + x);

    }

}


class Sub extends Super{

    int y;

    Sub(int y, int x){

        super(x);

        this.y = y;

    }


    public void display(){
        
        System.out.println("The y is " + y);
        System.out.println("The x is " + x);
        

    }

}


class OverrideTest{

    public static void main(String args[]){

        Sub obj = new Sub(10, 12);

        obj.display();

    }



}