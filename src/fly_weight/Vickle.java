package fly_weight;

public interface Vickle {
    public void assigneColor (String name ) ;
    void StartEngine () ;
}
class Truck implements Vickle{
    int maxSpeed ;
   String color ;

    public Truck() {
        this.maxSpeed = (250);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void assigneColor(String name) {
     this.color = color ;
    }

    @Override
    public void StartEngine() {
        System.out.println("this truck is "+this.color+"and the speed is "+ this.maxSpeed);
    }
}
class Cyckel implements Vickle{
    int maxSpeed ;
    String color ;

    public Cyckel() {
        this.maxSpeed = 25;
    }

    @Override
    public String toString() {
        return "Cyckel{" +
                "maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void assigneColor(String name) {
        this.color = color ;
    }

    @Override
    public void StartEngine() {
        System.out.println("this Cyckel is "+this.color+"and the speed is "+ this.maxSpeed);
    }
}