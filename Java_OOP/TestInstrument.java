import java.util.*;
abstract class Instrument
{
    abstract void play();
}
class Piano extends Instrument
{
    void play()
    {
        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Guitar extends Instrument
{
    void play()
    {
        System.out.println("Guitar is playing tin tin tin tin");
    }
}
class Flute extends Instrument
{
    void play()
    {
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class TestInstrument
{
    public static void main(String args[])
    {
        Instrument it[]=new Instrument [10];
        Random r=new Random();
        for(int i=0;i<it.length;i++)
        {
            int temp=r.nextInt(3);
            if(temp==0)
            {
                it[i]=new Guitar();
            }
            else if(temp==1)
            {
                it[i]=new Piano();
            }
            else if(temp==2)
            {
                it[i]=new Flute();
            }
        }
        for(int i=0;i<it.length;i++)
        {
            if(it[i] instanceof Guitar==true)
            {
                System.out.println("\nGuitar object created!");
            }
            else if(it[i] instanceof Piano==true)
            {
                System.out.println("\nPiano object created!");
            }
            else if(it[i] instanceof Flute==true)
            {
                System.out.println("\nFlute object created!");
            }
            it[i].play();
        }
    }
}