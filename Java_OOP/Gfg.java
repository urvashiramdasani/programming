class Gfg 
{ 
    // constructor 
    Gfg() 
    { 
        System.out.println("Geeksforgeeks"); 
    } 
      
    static Gfg a = new Gfg(); //line 8  // stack overflow error when  
                                        //static is removed
    public static void main(String args[]) 
    { 
        Gfg b; //line 12 
        b = new Gfg(); 
    } 
} 