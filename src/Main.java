package src;

public class Main
{
    public static void main(String[] args)
    {
        Optimizer optimizer = new Optimizer();
        optimizer.find_optimal("cars");
        optimizer.find_optimal("cars", "mpg.csv");
    }
}