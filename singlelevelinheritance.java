import java.lang.*;

class base
{
    int b;
    base(){}
    base (int bb)
    {
        this.b = bb;
        System.out.println ("\n Base class : b = "+ b);
    }
}

class child extends base
{
    int c;
    child(){}
    child (int bb, int cc)
    {
        super(bb); 
        this.c = cc; 
        System.out.println ("\n Child class : c = "+ c);
    }
}

public class singlelevelinheritance
{
    public static void main(String[] args)
    {
        child cobj = new child(1,2);
    }      
}


