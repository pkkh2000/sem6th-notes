import java.rmi.*;
public class MyClient{
public static void main(String args[]){
try{

Adder stub=(Adder)Naming.lookup("sonoo");

System.out.println(stub.checkEQ("hello","hello"));

}catch(Exception e){e.printStackTrace();}
}
}