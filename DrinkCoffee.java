//example for recursive methods in lecture
public class DrinkCoffee
{
    public DrinkCoffee()
    {
        
    }
    
    public static void finishCoffee (Cup cup)
    {   
        if (! cup.isEmpty())
        {   
            cup.takeOneSip();
            finishCoffee(cup);
            
        }
        
        else 
        {
            System.out.println("no more sips");
        }
    }
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Cup cup = new Cup();
        
        finishCoffee(cup);
        
       
    }
}
