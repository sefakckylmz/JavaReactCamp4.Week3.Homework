package Adapters;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoap client = new KPSPublicSoapProxy(); 
		
		boolean serviceResult=false;
    	
    	try {
    		
    		serviceResult = client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstname(), player.getLastname(), player.getDateofBirth().getYear());
    		
		} catch (Exception e) {
			
			System.out.println("Not a valid person");
		}
    	    
       return serviceResult;
	}

}
