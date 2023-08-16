package OwnCollections;

import java.util.Collection;
import java.util.List;

public class RoomCollections {
    private String name; 
    private String type; 
    private int capacity;
    private double rate;

    public RoomCollections(String name, String type, int capacity, double rate){
        this.name = name;
        this.type = type; 
        this.capacity = capacity; 
        this.rate = rate; 
    }
    
    public RoomCollections(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "RoomCollections [name=" + name + ", type=" + type + ", capacity=" + capacity + ", rate=" + rate + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + capacity;
        long temp;
        temp = Double.doubleToLongBits(rate);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RoomCollections other = (RoomCollections) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (capacity != other.capacity)
            return false;
        if (Double.doubleToLongBits(rate) != Double.doubleToLongBits(other.rate))
            return false;
        return true;
    }
    
    public static double getPotentialRevenue(Collection<RoomCollections> rooms){
        return rooms.stream()
        .mapToDouble(r -> r.getRate())
        .sum();
    }
    public static void main(String[] args) {
        RoomCollections cambridge = new RoomCollections("Cambridge", "Premiere Room", 4, 175.00);
        RoomCollections manchester = new RoomCollections("Manchester", "Suite", 5, 250.00);
        RoomCollections piccadilly = new RoomCollections("Piccadilly", "Guest Room", 3, 225.00);

        //saving into a collection
        Collection<RoomCollections> rooms = List.of(cambridge, manchester, piccadilly);
        rooms.add(piccadilly);
        double total = getPotentialRevenue(rooms);
        System.out.println(total);
    }
}

