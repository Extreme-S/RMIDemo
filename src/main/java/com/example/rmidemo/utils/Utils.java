package com.example.rmidemo.utils;

import com.example.rmidemo.service.RMIService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Utils {
    private static final int REGISTRY_PORT=9999;
    private static final String SERVER_ADDRESS="127.0.0.1";
    private static final String SERVICE_URL="rmi://"+SERVER_ADDRESS+":"+REGISTRY_PORT+"/test";
    public RMIService connect(){
            RMIService rmiService=null;
            try {
                rmiService=(RMIService) Naming.lookup(SERVICE_URL);
            } catch (MalformedURLException | RemoteException | NotBoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        return rmiService;
    }
}
