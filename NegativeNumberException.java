public class NegativeNumberException extends Exception
{
    private String msg;
    {
        msg="-ve no";
    }
    public NegativeNumberException(String msg)
    {
        this.msg=msg;
    }
    @Override
    public String getMessage()
    {
        rertun msg;
    }
    @Override
    public String toString()
    {
        return "java.lang.NegativeNumberException: "+msg;
    }
    
}
