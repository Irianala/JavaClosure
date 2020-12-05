package irianala.javaclosure.protocol.closure;

public interface TypedClosure<T> extends Closure {
	public void executeTypedStatement(T arg);
}
