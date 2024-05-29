class Pen {
    
    private String brand;
    private double price;

    
    public Pen(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

   
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    
    public void displayDetails() {
        System.out.println("Pen Details:");
        System.out.println("Brand:- " + brand);
        System.out.println("Price:- " + price);
    }
}


class BallpointPen extends Pen {
   
    private String inkColor;

   
    public BallpointPen(String brand, double price, String inkColor) {
        super(brand, price); 
        this.inkColor = inkColor;
    }

    
    public String getInkColor() {
        return inkColor;
    }

    
    
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Ink Color:- " + inkColor);
    }
}


class GelPen extends BallpointPen {
    private double tipSize;

    public GelPen(String brand, double price, String inkColor, double tipSize) {
        super(brand, price, inkColor);
        this.tipSize = tipSize;
    }

    public double getTipSize() {
        return tipSize;
    }

    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tip Size:- " + tipSize + " mm");
    }
}




public class inhr{
    public static void main(String[] args) {
        Pen elkos=new Pen("Elkos",10);
        elkos.displayDetails();
        System.out.println();
        BallpointPen figo =new BallpointPen("Figo",3,"Blue");
        figo.displayDetails();

        System.out.println();

        GelPen rorito=new GelPen("Rorito",20,"Black",0.7);
        rorito.displayDetails();

        System.out.println("\nBrand name is :- "+rorito.getBrand());
        System.out.println("\nInk color is :- "+rorito.getInkColor());
    

    }
}



