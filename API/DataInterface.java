/* 18360021 - Randy Ikhsan Ramadhan - Pemrograman Jaringan */
package API;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DataInterface extends Remote{
    public void metodeSatu() throws RemoteException;
    public void metodeDua() throws RemoteException;
   
}