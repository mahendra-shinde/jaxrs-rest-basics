package com.mahendra.app;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.mahendra.models.Account;
import com.mahendra.services.*;


public class Main3 {

	public static void main(String[] args) {
		AccountServiceImplService service = new AccountServiceImplServiceLocator();
		try {
			AccountServiceImpl client= service.getAccountServiceImpl();
			System.out.println(client);
			Account acc = new Account(108,11000, "Vallya");
			client.save(acc);
			System.out.println("Saved!");
			Account[]  data = client.getAccounts();
			for(Account a: data) {
				System.out.println(a.getAccountNo()+" "+a.getBalance());
			}
			
		} catch (ServiceException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
