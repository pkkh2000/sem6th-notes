import java.rmi.*;
public class MyClient{
public static void main(String args[]){
try{

Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");

System.out.println(stub.checkEQ("hello","bye"));

}catch(Exception e){e.printStackTrace();}
}
}