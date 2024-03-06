package WorkStream.map.filter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("CArs",123);
//        Car.printFuckk();
//
//        String s = car1.getNumber();
//        System.out.println(s);

        MiniCar miniCar = new MiniCar("fff", 123123);
        System.out.println(miniCar.getNumber());

//        List<Car> cars = Arrays.asList(
//                new Car("AA1111BX", 2007),
//                new Car("AK5555IT", 2010),
//                new Car(null, 2012),
//                new Car("", 2015),
//                new Car("AI3838PP", 2017));
//        cars.stream()
//                .filter(c -> c.getYear() > 2010)
//                .map(Car::getNumber)
//                .filter(s -> s != null && !s.isEmpty())
//                .forEach(System.out::println);
    }
}