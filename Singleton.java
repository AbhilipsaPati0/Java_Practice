//singlton 
public class Singleton{
    public static Singleton singleton= new Singleton();

    /*A private constructor prevents any other
     * class from instantiating
     */
    private Singleton(){}

    /*static singleton method */
    public static Singleton getInstance() {
        return singleton;
    }

    /*other methods proetected by singleton-ness */
    protected static void demoMethod(){
        System.out.println("demoMethod for singleton");
    }
}