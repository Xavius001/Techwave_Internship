package TestDemo.TestDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ICalculator C = new Calculator();
        System.out.println(C.add(10, 20));
        System.out.println(C.product(20, 30));
    }
}
