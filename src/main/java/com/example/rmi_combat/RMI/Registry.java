package com.example.rmi_combat.RMI;

import com.example.rmi_combat.config.RMIConfig;
import com.example.rmi_combat.service.StuService;
import com.example.rmi_combat.service.impl.StuServiceImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class Registry {
    public static void main(String[] args) {
        //注册服务，并暴露服务
        StuService rmiServiceObject = null;
        try {
            rmiServiceObject = new StuServiceImpl();
            LocateRegistry.createRegistry(RMIConfig.REGISTRY_PORT);//在本地打开一个注册中心服务
            Naming.rebind(RMIConfig.SERVICE_URL, rmiServiceObject);//远程服务对象注册到注册中心
            System.out.println("远程服务已注册并打开。。。。");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
