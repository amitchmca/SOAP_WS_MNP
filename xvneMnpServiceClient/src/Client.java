import java.rmi.RemoteException;

import org.example.www.xvneMnpService.XvneMnpWebServiceLocator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XvneMnpWebServiceLocator locator = new XvneMnpWebServiceLocator();
		
		try {
			System.out.println(locator.getServiceName().getNamespaceURI());
			
			locator.
			System.out.println(locator.getxvneMnpPort());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
