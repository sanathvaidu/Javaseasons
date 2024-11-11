package exceptions;

public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException()
	{
		super("Invalid age..please vist to this page once your age is 18");
	}

}
