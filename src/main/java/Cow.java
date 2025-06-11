/**
 * Represents a cow with a name, age, and weight.
 */
public class Cow {
    private String name;
    private int age;
    private double weight;

    /**
     * Constructs a Cow with the given name, age, and weight.
     * @param name the cow's name
     * @param age the cow's age
     * @param weight the cow's weight in kilograms
     */
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + ", " + age + " - " + weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cow) {
            Cow other = (Cow) obj;
            return this.name.equals(other.name) &&
                   this.age == other.age &&
                   this.weight == other.weight;
        }
        return false;
    }
}