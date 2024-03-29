package com.mahendra.services;

public class HelloServiceProxy implements com.mahendra.services.HelloService {
  private String _endpoint = null;
  private com.mahendra.services.HelloService helloService = null;
  
  public HelloServiceProxy() {
    _initHelloServiceProxy();
  }
  
  public HelloServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloServiceProxy();
  }
  
  private void _initHelloServiceProxy() {
    try {
      helloService = (new com.mahendra.services.HelloServiceServiceLocator()).getHelloService();
      if (helloService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloService != null)
      ((javax.xml.rpc.Stub)helloService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.mahendra.services.HelloService getHelloService() {
    if (helloService == null)
      _initHelloServiceProxy();
    return helloService;
  }
  
  public java.lang.String sayHello() throws java.rmi.RemoteException{
    if (helloService == null)
      _initHelloServiceProxy();
    return helloService.sayHello();
  }
  
  
}