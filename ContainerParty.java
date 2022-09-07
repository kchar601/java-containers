import java.util.ArrayList;

public class ContainerParty {
    private String date;
    private ArrayList<Person> personList;
    private ArrayList<Container> containerList;
    private String address;

    public ContainerParty(String date, String address)
    {
        this.date = date;
        this.address = address;
        this.personList = new ArrayList();
        this.containerList = new ArrayList();
    }

    public ContainerParty()
    {
        this.date = "N/A";
        this.personList = new ArrayList();
        this.containerList = new ArrayList();
        this.address = "N/A";
    }

    public void addPerson(Person p)
    {
        personList.add(p);
    }

    public void addContainer(Container c)
    {
        containerList.add(c);
    }

    public String getInfo()
    {
        String info = "\nContainer Party on " + this.date + " at " +this.address + "\n\nContainers:";
        for (Container c: containerList) {
            info += c.getInfo();
        }
        info += "\n\nPeople Attending: ";
        for (Person p : personList) {
            info += p.getInfo();
        }
        return info;
    }
}
