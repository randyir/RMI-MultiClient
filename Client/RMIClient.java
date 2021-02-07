package Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import API.DataInterface;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException{
        DataInterface data = (DataInterface) Naming.lookup("rmi://localhost:1099/data");
        System.out.println("Client Berhasil Terkoneksi ke Server");
        
        data.metodeSatu();
        data.metodeDua();
        
        System.out.println("Client telah selesai");
    }
}
