public class Singleton {
    private String data="Top Secrect";
    static private Singleton instance=null;
    private Singleton() {
    }
    static Singleton getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }
    void getDetails()
    {
        System.out.println(data);
    }
}
