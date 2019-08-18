import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Feline> felines = new ArrayList<Feline>();
        List<LittleDoggy> littleDoggies = new ArrayList<LittleDoggy>();
        f(felines);
        f(littleDoggies);

        contraf(felines);

    }

    public static void f(List<? extends Animal> t) {
        // can only read
        Animal b = t.get(1);
        // the data you read is generalized

    }

    public static void contraf(List<? super Tiger> t) {
        // can only write
        t.add(new Tiger());

        // the data you can add is specialized

    }


}
