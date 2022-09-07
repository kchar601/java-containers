public class CircularContainer extends Container{
    private double radius;

    public CircularContainer(String brand, double height, String color, double radius)
    {
        super(brand, height, color);
        this.radius = radius;
    }

    public CircularContainer()
    {
        super();
        this.radius = -1;
    }

    @Override
    public String getInfo()
    {
        return super.getInfo() + "\n\tRadius: " + this.radius + " inches\n\tVolume: " + calculateVolume() + " square inches";
    }

    @Override
    public double calculateVolume()
    { 
        return (Math.PI * this.radius * this.radius * this.height);
    }
}
