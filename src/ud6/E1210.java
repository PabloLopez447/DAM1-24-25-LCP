package ud6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class E1210 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Set<Integer> nums2 = new TreeSet<>();
        Set<Integer> nums3 = new TreeSet<>();
        Set<Integer> nums4 = new TreeSet<>();

        Random rnd = new Random();

        for (int i = 0; i < 20; i++) {
            nums.add(rnd.nextInt(10) + 1);
        }
        nums2.addAll(nums);

        for (Integer numero : nums) {
            if (nums.indexOf(numero) != nums.lastIndexOf(numero)) {
                nums3.add(numero);
            }
        }

        for (Integer numero : nums) {
            if (nums.indexOf(numero) == nums.lastIndexOf(numero)) {
                nums4.add(numero);
            }
        }

        System.out.println(nums);
        System.out.println(nums2);
        System.out.println(nums3);
        System.out.println(nums4);

    }
}
