package FunctionalInterfaces;

public interface QuadFunction<T , V, R, W> {
	
	W quad(T t, V v, R r);
}
