import java.rmi.*;
import java.util.*;
public interface Adder extends Remote
{
public ArrayList<String> checkEQ(String arg1,String  arg2) throws RemoteException;
}