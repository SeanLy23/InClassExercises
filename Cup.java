
public class Cup
{
    private int sips = 10;
    
    public Cup()
    {
        this.sips = 10;
    }
    
    public void takeOneSip()
    {
        this.sips--;
        System.out.println("\t" + sips);
    }
    
    public boolean isEmpty()
    {
        return this.sips == 0;
    }
    
    public int getSips ()
    {
        return this.sips;
    }
}
