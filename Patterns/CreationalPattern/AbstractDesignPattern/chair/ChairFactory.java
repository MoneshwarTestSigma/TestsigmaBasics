package chair;
public class ChairFactory {
    static public Furniture getInstance(String str)
    {
        if(str=="modern")
            return new ChairModern();
        else if(str=="artdecor")
            return new ChairArtDeco();
        else
            return new ChairVictoria();
    }
}
