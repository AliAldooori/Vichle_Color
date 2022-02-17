package fly_weight;

public class Main {

    public static void main(String[] args) {
        /*
         * for the first time we write "Cyckle " the HashMap key does't have this key
         * so we create v by switch condition
         */
      Vickle v1 = VickleFactory.get_Instance("Truck");
      v1.assigneColor("red");
      v1.StartEngine();
      v1.hashCode();
    }
}
