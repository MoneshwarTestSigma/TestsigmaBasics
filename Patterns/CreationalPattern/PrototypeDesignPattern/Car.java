public class Car implements Prototype{
    private int number;
    private String color;
    private String brand;

    public Car(int number, String color, String brand) {
        this.number = number;
        this.color = color;
        this.brand = brand;
    }
    public Car(Car obj) //Copy constructor
    {
        this.number= obj.number;
        this.color= obj.color;
        this.brand= obj.brand;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
    void getDetails()
    {
        System.out.println("Number:"+number +" Name:"+brand+" Color:"+color);
    }
}
