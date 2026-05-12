package test;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        Integer[] result = arrayMapping(numbers, new MultiplyByTwo());
        System.out.println(Arrays.toString(result));
    }

    public static <T> T[] arrayMapping(T[] array, Function<T> function) {
        T[] result = array.clone();
        for (int i = 0; i < result.length; i++) {
            result[i] = function.apply(result[i]);
        }
        return result;
    }
}