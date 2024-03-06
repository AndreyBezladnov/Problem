package JustProblem;

import java.util.ArrayList;

public class ggg {


    class Car {
        public ArrayList<Car> createPoliceCars(int count) {
            ArrayList<Car> result = new ArrayList<Car>();

            for (int i = 0; i < count; i++) {
                final int number = i;
                result.add(new Car() {
                    public String toString() {
                        return "" + number;
                    }
                });
            }
            return result;
        }
    }
}
