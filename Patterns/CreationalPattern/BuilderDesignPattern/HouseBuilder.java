public class HouseBuilder {
    private String color="";
    private boolean swimmingPool=false;
    private boolean park=false;
    private boolean fancyRoof=false;
    private String name="";

    public HouseBuilder color(String color) {
        this.color = color;
        return this;
    }

    public HouseBuilder fancyRoof(boolean fancyRoof) {
        this.fancyRoof = fancyRoof;
        return this;
    }

    public HouseBuilder name(String name) {
        this.name = name;
        return this;
    }

    public HouseBuilder park(boolean park) {
        this.park = park;
        return this;
    }

    public HouseBuilder swimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }
    public House getHouse()
    {
        return new House(color,swimmingPool,park,fancyRoof,name);
    }

}

