package Day4;

public class InsufficientFundException  extends RuntimeException
{
public InsufficientFundException ()
{
	super("Insufficient balance");
}
}
