class Singleton 
{
    private static Singleton single_instance = null;

    public String s;
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }

    public static synchronized Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}


class Geeks 
{
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        System.out.println("Hashcode of x is "
                           + x.hashCode());
        System.out.println("Hashcode of y is "
                           + y.hashCode());
        System.out.println("Hashcode of z is "
                           + z.hashCode());

     
        if (x == y && y == z) {

            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}