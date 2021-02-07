package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import API.DataInterface;

public class Data extends UnicastRemoteObject implements DataInterface{
    private static final long serialVersionUID = 1L;
    public Data() throws RemoteException {  
    }
    
    @Override
    public void metodeSatu() throws RemoteException {
        System.out.println("Metode Satu Dijalankan");
    }
    
    @Override
    public void metodeDua() throws RemoteException {
        System.out.println("Metode Dua Dijalankan");
    }
}
