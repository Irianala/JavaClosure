package irianala.javaclosure.protocol.closure;

import irianala.javaclosure.protocol.ErrorEvent;

public interface ErrorClosure<T extends ErrorEvent> extends Closure {
	public void executeErrorStatement(T arg);
}
