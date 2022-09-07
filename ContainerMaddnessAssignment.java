public class ContainerMaddnessAssignment {

    public static void main(String[] args) {
        ContainerParty halloween = new ContainerParty("10/31/2021", "123 MadeUp Lane");
        ContainerParty christmas = new ContainerParty("12/25/2021", "456 Java Street");

        Person liam = new Person("Liam", 22, "Candy");
        Person noah = new Person("Noah", 23, "Costume");
        Person oliver = new Person("Oliver", 24, "Screams");

        halloween.addPerson(liam);
        halloween.addPerson(noah);
        halloween.addPerson(oliver);

        Person olivia = new Person("Olivia", 35, "Cookies");
        Person emma = new Person("Emma", 36, "Presents");
        Person ava = new Person("Ava", 37, "Decorations");

        christmas.addPerson(olivia);
        christmas.addPerson(emma);
        christmas.addPerson(ava);

        RectangularContainer box = new RectangularContainer("Amazon", 30, "Brown", 36, 48);
        RectangularContainer tupperWare = new RectangularContainer("Tupperware", 6, "Clear", 12, 24);

        CircularContainer bowl = new CircularContainer("Target", 6, "White", 8);
        CircularContainer sodaCan = new CircularContainer("Coca-Cola", 4.8, "Red", 1.3);

        halloween.addContainer(box);
        halloween.addContainer(tupperWare);
        halloween.addContainer(bowl);
        halloween.addContainer(sodaCan);

        RectangularContainer cooler = new RectangularContainer("Yeti", 30, "Black", 40, 60);
        RectangularContainer suitCase = new RectangularContainer("Away", 22.7, "Blue", 14.7, 9.6);

        CircularContainer masonJar = new CircularContainer("Ball", 5, "White", 3);
        CircularContainer trashCan = new CircularContainer("Rubbermaid", 31, "Gray", 12);

        christmas.addContainer(cooler);
        christmas.addContainer(suitCase);
        christmas.addContainer(masonJar);
        christmas.addContainer(trashCan);

        System.out.println(halloween.getInfo());
        System.out.println(christmas.getInfo());

    }
}