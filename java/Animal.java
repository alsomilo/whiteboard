class Animal 
{
    String name;
    enum Rank 
    {
        LOW,
        MED,
        HIGH
    }
    
    Animal(String n) 
    {
        name = n;
    }
    
    public boolean equal(Object obj) 
    {
        boolean res = true;
        if(this.name != ((Animal)obj).name) res = false;
        return res;

    }
    
    public static void main(String[ ] args) 
    {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1.equal(a2));
        
        Rank r1 = Rank.MED;
        Rank r2 = Rank.MED;
        System.out.println(r1 == r2);
    }
}

//Outputs true
