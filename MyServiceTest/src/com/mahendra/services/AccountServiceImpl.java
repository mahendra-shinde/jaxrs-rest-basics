/**
 * AccountServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mahendra.services;

public interface AccountServiceImpl extends java.rmi.Remote {
    public void save(com.mahendra.models.Account ac) throws java.rmi.RemoteException;
    public com.mahendra.models.Account[] getAccounts() throws java.rmi.RemoteException;
}
