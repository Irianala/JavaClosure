package irianala.javaclosure.main;

import irianala.javaclosure.impl.DefaultError;
import irianala.javaclosure.impl.DefaultSuccess;
import irianala.javaclosure.protocol.ErrorEvent;
import irianala.javaclosure.protocol.SuccessEvent;
import irianala.javaclosure.protocol.closure.ErrorClosure;
import irianala.javaclosure.protocol.closure.SuccessClosure;
import irianala.javaclosure.protocol.closure.TypedClosure;
import irianala.javaclosure.protocol.closure.VoidClosure;

public class JavaClosure {

	public static void main(String[] args) {
		executeClosure(() -> {
			System.out.println("I'm executed before everyone else");
		},
		"Natolotra",
		(success) -> {
			System.out.println(((DefaultSuccess) success).getDescription());
		},
		(error) -> {
			System.out.println(((DefaultError) error).getDescription());
		});
	}
	
	public static void executeClosure(String arg, TypedClosure<String> closure) {
		closure.executeTypedStatement(arg);
	}
	
	public static void executeClosure(VoidClosure before, String arg, SuccessClosure<SuccessEvent> success, ErrorClosure<ErrorEvent> failure) {
		before.executeVoidStatement();
		
		if (arg.equals("Natolotraa")) {
			success.execureSuccessStatement(new DefaultSuccess("yay, this works"));
		} else {
			failure.executeErrorStatement(new DefaultError("awww, error occurs"));
		}
		
	}

}
