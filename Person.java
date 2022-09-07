public class Person {
    private String name;
    private int age;
    private String bringing;

    public Person(String name, int age, String bringing)
    {
        this.name = name;
        this.age = age;
        this.bringing = bringing;
    }
    
    public Person()
    {
        this.name = "N/A";
        this.age = -1;
        this.bringing = "N/A";
    }

    public String getName()
    {
        return this.name;
    }
    
    public String getInfo()
    {
        return "\nName: " + this.name + "\n\tAge: " + this.age + "\n\tBringing: " + this.bringing;
    }
}
