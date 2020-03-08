public class Audi extends Car {

    //Setting Private Values//
    private String make;
    private String owner;
    private float  cost;

    //Setting Up Constructor//
    public Audi(String colour, int year, float topSpeed, String make, String owner, float cost)
    {
        super(colour, year, topSpeed);
        this.make = make;
        this.owner = owner;
        this.cost = cost;
    }


    //Getter//
    public String getMake()
    {
        return make;
    }
    public String getOwner()
    {
        return owner;
    }
    public float getCost()
    {
        return cost;
    }

    //Setter//
    public void setMake(String make)
    {
        this.make = make;
    }
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    public void setCost(float  cost)
    {
        this.cost = cost;
    }

}
