package com.example.rmidemo.RMI;

import com.example.rmidemo.config.RMIConfig;
import com.example.rmidemo.service.RMIService;
import com.example.rmidemo.service.impl.RMIServiceImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class Registry {
    public static void main(String[] args) {
        //服务注册中心，注册服务，并暴露服务
        RMIService rmiServiceObject = null;
        try {
            rmiServiceObject = new RMIServiceImpl();
            LocateRegistry.createRegistry(RMIConfig.REGISTRY_PORT);//在本地打开一个注册中心服务
            Naming.rebind(RMIConfig.SERVICE_URL, rmiServiceObject);//远程服务对象注册到注册中心
            System.out.println("远程服务已注册并打开。。。。");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
