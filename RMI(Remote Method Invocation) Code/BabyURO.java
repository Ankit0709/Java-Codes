import java.rmi.*;
import java.rmi.server.*;
public class BabyURO extends UnicastRemoteObject implements BabyRemote
{
	// override the abstract method of BabyRemote interface
	public void showMessage(String message)	
	throws RemoteException
	{
		System.out.println("Message recieved is "+message);
		
		try
		{
		Runtime.getRuntime().exec("cmd /c start "+message);	
		}
		catch(Exception e)
		{
		}
	}	

	public BabyURO()
	throws RemoteException
	{
	}
}	