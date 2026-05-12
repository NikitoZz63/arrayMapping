package test;

@FunctionalInterface
public interface Function<T> {
    T apply(T o);
}
