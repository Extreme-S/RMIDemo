package com.example.rmi_combat.service;

import com.example.rmi_combat.domain.Student;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StuService extends Remote {
    //必须抛出异常
    String run() throws RemoteException;

    //登录
    Student login(Student student) throws RemoteException;

    //消费
    Student cost(Student student) throws RemoteException;

    //注册
    Student register(Student student) throws RemoteException;

    //充值
    Student recharge(Student student) throws RemoteException;
}
