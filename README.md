# JavaClosure
JavaClosure is an implementation of Swift Closure with Java 

The main idea of closure is to use methods as method’s parameter. But Java doesn’t allow such a thing. So we can use the power of Lambda Expression (available since Java JDK 1.8) to do so.

We can have four examples of implementation in this project, VoidClosure, TypedClosure, SuccessClosure and ErrorClosure.

### VoidClosure
VoidClosure is a closure that wouldn’t receive parameters for its execution.

### TypedClosure
TypedClosure is a closure that would receive some parameters that can be used for its execution.

### SuccessClosure
SuccessClosure is like TypedClosure but it use specifically a class that inherit or implements specific Interface called **SuccessEvent**.

### ErrorClosure
ErrorClosure is the same as SuccessClosure but used with class that inherit or implements **ErrorEvent**.

### Example of use
- **This is how we can create methods which use closure**
``` Java
	public static void executeClosure(String arg, TypedClosure<String> closure) {
		closure.executeTypedStatement(arg);
	}
	
	public static void executeClosure(VoidClosure before, String arg, SuccessClosure<SuccessEvent> success, ErrorClosure<ErrorEvent> failure) {
		before.executeVoidStatement();
		
		if (arg.equals("Natolotra")) {
			success.execureSuccessStatement(new DefaultSuccess("yay, this works"));
		} else {
			failure.executeErrorStatement(new DefaultError("awww, error occurred"));
		}
	}
```
- **Then this is how we can use those methods after**
``` Java
//Using Void, Success and Error Closure
	executeClosure(
			() -> {
				System.out.println("I'm executed before everyone else");
			},
			"Natolotra",
			(success) -> {
				System.out.println(((DefaultSuccess) success).getDescription());
			},
			(error) -> {
				System.out.println(((DefaultError) error).getDescription());
			});
```

``` Java
//Using Typed Closure
	executeClosure(
			"Natolotra",
			(param) -> {
				System.out.println(param);
			});
```

