package irianala.javaclosure.protocol.closure;

import irianala.javaclosure.protocol.SuccessEvent;

public interface SuccessClosure<T extends SuccessEvent> extends Closure {
	public void execureSuccessStatement(T arg);
}
