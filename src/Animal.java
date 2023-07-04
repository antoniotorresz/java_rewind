import java.util.List;

public class Animal {
    int id;
    String name;

    List<String> attributes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public Animal(int id, String name, List<String> attributes) {
        this.id = id;
        this.name = name;
        this.attributes = attributes;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
