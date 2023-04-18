interface Area{
    final static float pi = 3.14f;
    float compute(float X, float Y);
}


class Rectangle implements Area{

    public float compute(float X, float Y){

        return(X*Y);

    }

}


class Circle implements Area{

    public float compute(float X, float Y){

        return(pi*X*Y);

    }

}


class InterfaceTest{

    public static void main(String args[]){

        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area area;

        area = rect;
        System.out.println("Area of rectangle : " + area.compute(10,12));

        area = cir;
        System.out.println("Area of Circle : " + area.compute(10,12));

    }

}