

public class Main {

    public static void main(String args[]) {
        Count s = new Count();
        s.increment();
        s.increment();
        s.increment();
        System.out.println(s.counter); //3

        Count s2 = new Count();
        System.out.println(s2.counter); //3 also, because s2 is the same instance as s, just two different variable pointing to the same instance

        String txt;
        txt = (s.equals(s2)) ? "same" : "not same";
        System.out.println(txt); //same
    }
}

class Count {

    public int counter = 0;

  public  Count(){}
    public void increment() {
        this.counter++;
    }
}
