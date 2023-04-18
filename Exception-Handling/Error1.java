import java.io.*;

class MarkOutOfBoundsException extends Exception{
    void errorhandling(){
        System.out.println("\n Mark out of bound");
    }
}

class Error1{

    public static void main(String args[]) throws IOException{


        try{
        int m1, m2, m3, total;

        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a 3 number :  \n ");

        m1 = Integer.parseInt(d.readLine());
        m2 = Integer.parseInt(d.readLine());
        m3 = Integer.parseInt(d.readLine());

        if(m1>100||m2>100||m3>100){

            throw new MarkOutOfBoundsException();

        }

        total = m1 + m2 +m3;

        System.out.println("Total : " + total);

        }

        

    catch(MarkOutOfBoundsException m){

        m.errorhandling();

    }

    catch(NumberFormatException e){

        System.out.println(" It is not an Integer ");

    }

    }

}