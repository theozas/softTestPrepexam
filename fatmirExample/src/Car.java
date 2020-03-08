public class Car {

    //Setting Private Values//
    private String colour;
    private int year;
    private float topSpeed;

    //Setting Up Constructor//
    public Car(String colour, int year, float topSpeed) {

        this.colour = colour;
        this.year = year;
        this.topSpeed = topSpeed;

    }

    //Getter//
    public String getColour()
    {
        return colour;
    }
    public int getYear()
    {
        return year;
    }
    public float getTopSpeed()
    {
        return topSpeed;
    }

    //Setter//
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setTopSpeed(float topSpeed)
    {
        this.topSpeed = topSpeed;
    }

}
