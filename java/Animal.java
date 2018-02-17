class Animal 
{
    String name;
    Animal(String n) 
    {
        name = n;
    }
    
    public boolean equal(Animal obj) 
    {
        boolean res = true;
        if(this.name != obj.name) res = false;
        return res;

    }
    
    public static void main(String[ ] args) 
    {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1.equal(a2));
    }
}

//Outputs true
