package Adapters;

import java.rmi.RemoteException;

import Abstracts.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceManager implements IGamerCheckService {

	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
			
			try {
			
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
			} catch (RemoteException e) {
				
				e.printStackTrace();	
		}
		return false;
	}
	
	
	

}
