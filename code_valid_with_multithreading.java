


public class Main {

    public static void main(String args[])
    {
        Count s = Count.getInstance();
        s.increment();s.increment();s.increment();
        System.out.println(s.counter); //3

        Count s2 = Count.getInstance();
        System.out.println(s2.counter); //3 also, because s2 is the same instance as s, just two different variable pointing to the same instance

        String txt;
        txt = (s.equals(s2)) ? "same":"not same";
        System.out.println(txt); //same
    }
}
class Count {

    private static Count instance = null;

    public int counter=0;

    // This private constructor is to prevent this object get instantiated more than once.
    private Count(){}

    public static Count getInstance()
    {
        if (instance==null){
            synchronized (Count.class)
            {
                if(instance==null)
                {
                    // if instance is null, initialize
                    instance = new Count();
                }

            }
//            instance =new Count();
        }
        return instance;
    }

    public void increment()
    {
        this.counter++;
    }


}
