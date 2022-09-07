public class RectangularContainer extends Container{
    private double width;
    private double length;

    public RectangularContainer(String brand, double height, String color, double width, double length)
    {
        super(brand, height, color);
        this.width = width;
        this.length = length;
    }

    public RectangularContainer()
    {
        super();
        this.width = -1;
        this.length = -1;
    }

    @Override
    public String getInfo()
    {
        return super.getInfo() + "\n\tWidth: " + this.width + " inches\n\tLength: " + this.length + " inches\n\tVolume: " + calculateVolume() + " inches cubed";
    }

    @Override
    public double calculateVolume()
    {
        return (this.height * this.length * this.width);
    }
}
