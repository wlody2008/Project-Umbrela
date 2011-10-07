import java.rmi.Remote;
import java.rmi.RemoteException;
 
public interface ServerIntf extends Remote {
    public String getMessage(string s) throws RemoteException;
}
