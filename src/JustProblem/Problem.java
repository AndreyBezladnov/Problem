package JustProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        List<Integer> list1 = new ArrayList<>(list);

        for (Integer integer : list1) {
//            System.out.println(integer);
            list.remove(integer);
        }

        System.out.println(list1.size());
        System.out.println(list.size());

        list1.size();
        list.size();
    }
}
