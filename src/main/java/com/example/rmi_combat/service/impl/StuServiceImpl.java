package com.example.rmi_combat.service.impl;

import com.example.rmi_combat.domain.Student;
import com.example.rmi_combat.service.StuService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StuServiceImpl extends UnicastRemoteObject implements StuService {
    public StuServiceImpl() throws RemoteException {
        super();
    }

    private static final long serialVersionUID = 1L;//辨别 ID

    @Override
    public String run() throws RemoteException {
        return null;
    }

    @Override
    public Student login(Student student) throws RemoteException {
        return null;
    }

    @Override
    public Student cost(Student student) throws RemoteException {
        return null;
    }

    @Override
    public Student register(Student student) throws RemoteException {
        return null;
    }

    @Override
    public Student recharge(Student student) throws RemoteException {
        return null;
    }
}
