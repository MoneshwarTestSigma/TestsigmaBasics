public class Main {
    public static void main(String[] args) {
        HouseBuilder obj=new HouseBuilder();
        obj.name("Monesh")
               .color("Green")
                .fancyRoof(true);
        House myHouse=obj.getHouse();
        myHouse.getDetails();
    }
}