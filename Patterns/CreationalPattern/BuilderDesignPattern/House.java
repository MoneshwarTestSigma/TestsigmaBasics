public class House {
    private String color;
    private boolean swimmingPool;
    private boolean park;
    private boolean fancyRoof;
    private String name;
    public void getDetails()
    {
        System.out.println("This is "+name+" house.It is "+color+ " in color."+"It has:");
        if(swimmingPool)
            System.out.println("Swimming Pool");
        if(park)
            System.out.println("Parking");
        if(fancyRoof)
            System.out.println("Fancy rooftop");
    }
    public House(String color, boolean swimmingPool, boolean park, boolean fancyRoof, String name) {
        this.color = color;
        this.swimmingPool = swimmingPool;
        this.park = park;
        this.fancyRoof = fancyRoof;
        this.name = name;
    }
}
