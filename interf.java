interface Vehicle {
    public void TyreCount();
    public void EngineCC();
}

interface Info{
    public void manufactureYear();
    public void countryName();
}

class Car implements Vehicle , Info{
    public void TyreCount(){
        System.out.println("Car is 4 wheeler !");
    }

    public void EngineCC(){
        System.out.println("Car have 1000cc engine !");
    }

    public void manufactureYear(){
        System.out.println("Car is manufactured in 2020 !");
    }

    public void countryName(){
        System.out.println("Car belongs to India !");
    }

    public void displayAll(){
        TyreCount();
        EngineCC();
        manufactureYear();
        countryName();
    }


}

class Bike implements Vehicle{
    public void TyreCount(){
        System.out.println("Bike is 2 wheeler !");
    }

    public void EngineCC(){
        System.out.println("Bike have 100cc Engine !");
    }

    public void manufactureYear(){
        System.out.println("Bike is manufactured in 2022 !");
    }

    public void countryName(){
        System.out.println("This bike belong to Japan !");
    }

    public void displayAll(){
        TyreCount();
        EngineCC();
        manufactureYear();
        countryName();
    }

}

public class interf{
    public static void main(String[] args) {
        Car car=new Car();
        Bike bike =new Bike();

        car.displayAll();
        System.out.println();
        bike.displayAll();    
    }
}