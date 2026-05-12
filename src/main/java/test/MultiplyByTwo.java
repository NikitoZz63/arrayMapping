package test;

public class MultiplyByTwo implements Function<Integer> {
    @Override
    public Integer apply(Integer n) {
        return n * 2;
    }
}
