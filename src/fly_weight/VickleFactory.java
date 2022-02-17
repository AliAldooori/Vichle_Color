package fly_weight;

import fly_weight.Cyckel;
import fly_weight.Vickle;

import java.util.HashMap;

public class VickleFactory {

    /*
     * this array called cache ( in this we can store the shared objects with intrinsic properties and
     * can be retrieved quickly on demand
     */
    private static HashMap <String , Vickle > hm = new HashMap<>();
    /*
     *  we check if (String type) not found in HashMap as a key so we create this object's type
     *  or we return the value of the key in HashMap (Vehicle)
     */
    public  static Vickle get_Instance (String type ) {

      Vickle v = null;
        if (hm.containsKey(type)) {

      v = hm.get(type);   // here we return the same object which found in hm (the same hashCode)
            /*
             * if the String type does not exist as a key in HashMap so we create this object for first time
             * but next time when we type it in this method we return it from cache
             */
        } else {
            switch (type) {
                case ("Truck "):
                          v = new Truck () ;
                    System.out.printf("%s type is created.%n", type);
                    break;
                case ("Cyckel"):
                    v = new Cyckel();
                    System.out.printf("%s type is created.%n", type);

                default:
               //     throw new IllegalStateException("Unexpected value: " + type);
            }

        }

        hm.put(type, v);
        return v;
    }

}
