import java.rmi.*;
public interface Adder extends Remote
{
public boolean checkEQ(String arg1,String  arg2) throws RemoteException;
}