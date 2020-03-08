public class R8 extends Audi {

    //Setting Private Values//
    private String Engine;
    private int lightcost;
    private float km;

    //Setting Up Constructor//
    public R8(String colour, int year, float topSpeed, String make, String owner, float cost, String Engine, int lightcost, float km) {
        super(colour, year, topSpeed, make, owner, cost);
        this.Engine = Engine;
        this.lightcost = lightcost;
        this.km = km;
    }

    //Getter//
    public String getEngine()
    {
        return Engine;
    }
    public int getLightcost()
    {
        return lightcost;
    }
    public float getKm()
    {
        return km;
    }

    //Setter//
    public void setEngine(String engine) {
        Engine = engine;
    }
    public void setLightcost(int lightcost) {
        this.lightcost = lightcost;
    }
    public void setKm(float km) {
        this.km = km;
    }
}
