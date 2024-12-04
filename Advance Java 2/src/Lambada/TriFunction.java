package Lambada;

@FunctionalInterface
public interface TriFunction<A, B, C, D, E> {
    E apply(A a, B b, C c, D d);
}
