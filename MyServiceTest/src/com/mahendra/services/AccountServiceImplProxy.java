package com.mahendra.services;

public class AccountServiceImplProxy implements com.mahendra.services.AccountServiceImpl {
  private String _endpoint = null;
  private com.mahendra.services.AccountServiceImpl accountServiceImpl = null;
  
  public AccountServiceImplProxy() {
    _initAccountServiceImplProxy();
  }
  
  public AccountServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initAccountServiceImplProxy();
  }
  
  private void _initAccountServiceImplProxy() {
    try {
      accountServiceImpl = (new com.mahendra.services.AccountServiceImplServiceLocator()).getAccountServiceImpl();
      if (accountServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)accountServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)accountServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (accountServiceImpl != null)
      ((javax.xml.rpc.Stub)accountServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mahendra.services.AccountServiceImpl getAccountServiceImpl() {
    if (accountServiceImpl == null)
      _initAccountServiceImplProxy();
    return accountServiceImpl;
  }
  
  public void save(com.mahendra.models.Account ac) throws java.rmi.RemoteException{
    if (accountServiceImpl == null)
      _initAccountServiceImplProxy();
    accountServiceImpl.save(ac);
  }
  
  public com.mahendra.models.Account[] getAccounts() throws java.rmi.RemoteException{
    if (accountServiceImpl == null)
      _initAccountServiceImplProxy();
    return accountServiceImpl.getAccounts();
  }
  
  
}