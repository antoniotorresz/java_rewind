import java.util.List;

public class Dog extends Animal{
    String hg_name;

    List<String> actions;

    public Dog(int id, String name, List<String> attributes, String hg_name, List<String> actions) {
        super(id, name, attributes);
        this.hg_name = hg_name;
        this.actions = actions;
    }

    public Dog(String hg_name, List<String> actions) {
        this.hg_name = hg_name;
        this.actions = actions;
    }

    public Dog() {
    }

    public String getHg_name() {
        return hg_name;
    }

    public void setHg_name(String hg_name) {
        this.hg_name = hg_name;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hg_name='" + hg_name + '\'' +
                ", actions=" + actions +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", attributes=" + attributes +
                '}';
    }

    public void bark() {
        System.out.println("Woof woof!");
    }
    public void cry() {
        System.out.println("  :'( ");
    }
}
