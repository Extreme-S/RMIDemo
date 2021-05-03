package com.example.rmi_combat.config;

public class RMIConfig {
    public static final int REGISTRY_PORT = 9999;
    public static final String SERVER_ADDRESS = "127.0.0.1";
    public static final String SERVICE_URL = "rmi://" + SERVER_ADDRESS + ":" + REGISTRY_PORT + "/test";
}
