public class Main {
public static void main(String[]args)
{
    System.out.println("Calling sum of 2 numbers");
    System.out.println(sum(1,2));
    System.out.println("Value was stored inside 'sum' (3rd variable)");
}

public static int sum(int x, int y) //assigning variables to the chosen integers
{
    int sum=x+y;
    return sum;
}
}
