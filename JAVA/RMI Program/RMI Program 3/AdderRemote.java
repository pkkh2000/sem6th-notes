import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class AdderRemote extends UnicastRemoteObject implements
Adder {
AdderRemote()throws RemoteException{
super();
}
public ArrayList<String> checkEQ(String arg1,String args2) throws RemoteException
{
ArrayList<String> st=new ArrayList<String>();
  if(arg1.equals(args2))
  {
  st.add("TRUTH");
  }
  st.add("FALSE");
return st;
}
}