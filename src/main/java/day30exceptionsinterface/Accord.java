package day30exceptionsinterface;

public class Accord extends Ac implements Engine, Security{

    @Override

    public void cool() {

        System.out.println("Accord cools super");

    }



    @Override

    public void run() {

        System.out.println("Engine runs super");

    }


}
