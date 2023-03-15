package sofa;

import chair.Furniture;

public class SofaFactory {
    static public Furniture getInstance(String str)
    {
        if(str=="modern")
            return new SofaModern();
        else if(str=="artdecor")
            return new SofaArtDeco();
        else
            return new SofaVictoria();
    }
}
