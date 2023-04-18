class Room{
    int lenght;
    int breadth;

    Room (int x, int y){
        lenght = x;
        breadth = y;
    }

    int area(){
        return(lenght*breadth);
    }

}

class Bedroom extends Room{

    int height;

    Bedroom(int x, int y, int z){
        super(x,y);
        height = z;
    }

    int volume(){
        return(lenght*breadth*height);
    }

}


class InheritanceTest{


    public static void main(String args[]){
            Bedroom b = new Bedroom(14, 12, 10);
            int area1 = b.area();
            int volume1 = b.volume();

            System.out.println("Area : " + area1);
            System.out.println("Volume : " + volume1);
    }

    
    

}