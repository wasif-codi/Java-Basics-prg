package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,1,3,3,1,6,3,9);

        /* Using Set
        Set<Integer> collect = nums.stream().distinct().collect(Collectors.toSet());
        System.out.println(collect);
        but set will not maintain insertion order */
        // using
//
        Double average = nums.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(average);

    }
}
