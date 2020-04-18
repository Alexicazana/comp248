package PartA;

class Sundae

//

{
    String IceCreamFlavor;
    int NumberOfScoops;
    boolean nuts;
    double cost;
    static int Obj;

    Sundae()

    {

        IceCreamFlavor="";
        NumberOfScoops=0;
        nuts=false;
        cost=0.0;
        Obj+=1;

    }


    Sundae(int NumberOfScoops, String IceCreamFlavor, boolean nuts)

    {
        this.NumberOfScoops = NumberOfScoops;
        this.IceCreamFlavor = IceCreamFlavor;
        this.nuts = nuts;


        caclCost();
        Obj+=1;
    }



    Sundae(Sundae s)


    {
        this.NumberOfScoops = s.NumberOfScoops;
        this.IceCreamFlavor = s.IceCreamFlavor;
        this.nuts = s.nuts;
        Obj+=1;
    }
    public String getIceCreamFlavor() {
        return IceCreamFlavor;
    }

    public void setIceCreamFlavor(String IceCreamFlavor) {
        this.IceCreamFlavor = IceCreamFlavor;
    }

    public int getNumberOfScoops() {
        return NumberOfScoops;
    }

    public void setNumberOfScoops(int NumberOfScoops) {
        this.NumberOfScoops = NumberOfScoops;
    }

    public boolean isNuts() {
        return nuts;
    }

    public void setNuts(boolean nuts) {
        this.nuts = nuts;
    }

    public double getCost() {
        return cost;
    }

    public static int getObj() {
        return Obj;
    }

    public void updateCost() {
        caclCost();
    }

    private void caclCost() {
        cost = (NumberOfScoops*1.50);
        if (nuts==true)
            cost+=1.25;
    }

    @Override
    public String toString()

    {
        return "Sundae [IceCreamFlavor=" + IceCreamFlavor + ", NumberOfScoops=" + NumberOfScoops + ", nuts=" + nuts + ", cost=" + cost + "]";
    }

    public boolean equals(Sundae s)

    {

        if (IceCreamFlavor.equals(s.IceCreamFlavor) && NumberOfScoops==s.NumberOfScoops && nuts==s.nuts)
            return true;
        return false;
    }

}

class A

{
    public static void main(String[] args)

    {

        Sundae s1 = new Sundae(3,"Vanilla",true);
        System.out.println(s1);
    }
}