package com.example.rmidemo.service.impl;

import com.example.rmidemo.domain.Student;
import com.example.rmidemo.service.RMIService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServiceImpl extends UnicastRemoteObject implements RMIService {
    public RMIServiceImpl() throws RemoteException {
        super();
    }

    private static final long serialVersionUID = 1L;//辨别 ID

    /**
     * Client RMI 调用测试方法
     *
     * @return
     * @throws RemoteException
     */
    @Override
    public String run() throws RemoteException {
        System.out.println("==========this is run method==========");
        return "执行成功";
    }

    /**
     * 学生登陆功能
     *
     * @param student
     * @return
     * @throws RemoteException
     */
    @Override
    public Student login(Student student) throws RemoteException {
        return null;
    }

    /**
     * 学生消费功能
     *
     * @param student
     * @return
     * @throws RemoteException
     */
    @Override
    public Student cost(Student student) throws RemoteException {
        return null;
    }

    /**
     * 学生注册功能
     *
     * @param student
     * @return
     * @throws RemoteException
     */
    @Override
    public Student register(Student student) throws RemoteException {
        return null;
    }

    /**
     * 学生充值功能
     *
     * @param student
     * @return
     * @throws RemoteException
     */
    @Override
    public Student recharge(Student student) throws RemoteException {
        return null;
    }
}
