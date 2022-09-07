public abstract class Container {
    private String brand;
    protected double height;
    private String color;
    
    public Container(String brand, double height, String color)
    {
        this.brand = brand;
        this.height = height;
        this.color = color;
    }

    public Container()
    {
        this.brand = "N/A";
        this.height = -1;
        this.color = "N/A";
    }

    public String getInfo()
    {
        return "\nBrand: " + this.brand + "\n\tColor: " + this.color + "\n\tHeight: " + this.height + " inches";
    }

    public abstract double calculateVolume();
}
