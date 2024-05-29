class Human{
    private String name;
    private int age ;
    private String gender;

    public Human(String name,int age , String gender){
        this.name =name;
        this.gender=gender;
        this.age=age;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
        System.out.println("Name updated !");
    }

    public int getAge(){
        return age;

    }

    public void setAge(int n){
        this.age=n;
        System.out.println("Age updated !\n");

    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender=gender;
        System.out.println("Gender updated !\n");
    }

    public void display(){
        System.out.println("Name :- "+this.name);
        System.out.println("Age :- "+this.age);
        System.out.println("Gender :- "+this.gender);
        System.out.println();

    }
}

class class_obj{
    public static void main(String[] args) {
        
        Human obj=new Human("Ashwin",18,"Male");

        obj.display();

        obj.setName("ASHWIN KHASA");
        obj.setAge(20);
        
        obj.display();

        String gen=obj.getGender();
        System.out.println(gen);
    }
}