package Chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : Kabelo Tlhape
 * Project : Java-Advanced-Training
 * Date   : 2026/10/14
 **/
public class DataStore {

    public static List<Integer> randomNumbers(){
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<>();

        int count = rnd.nextInt(5, 12);//6

        for (int i = 0; i < count; i++) {
            numbers.add(rnd.nextInt(15, 70));
        }
        return numbers;
    }
}
