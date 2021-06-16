import java.rmi.*;
import java.rmi.server.*;
public class AdderRemote extends UnicastRemoteObject implements
Adder {
AdderRemote()throws RemoteException{
super();
}
public boolean checkEQ(String arg1,String args2) throws RemoteException
{
  if(arg1.equals(args2))
  return true;
return false;
}
}