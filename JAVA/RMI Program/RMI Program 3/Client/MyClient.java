import java.rmi.*;
import java.util.*;
public class MyClient{
public static void main(String args[]){
try{
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");
ArrayList<String> ar=stub.checkEQ("hello","bye");
System.out.println(ar.get(0));
}catch(Exception e){e.printStackTrace();}
}
}