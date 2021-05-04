package com.example.rmidemo.RMI;

import com.example.rmidemo.service.RMIService;

import java.rmi.Naming;

public class TestClient {
    private static final int REGISTRY_PORT = 9999;
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final String SERVICE_URL = "rmi://" + SERVER_ADDRESS + ":" + REGISTRY_PORT + "/test";

    /**
     * 远程调用测试Client
     *
     * @param args
     */
    public static void main(String[] args) {
        RMIService RMIService = null;
        try {
            RMIService = (RMIService) Naming.lookup(SERVICE_URL);
            System.out.println("远程执行结果：" + RMIService.run());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
