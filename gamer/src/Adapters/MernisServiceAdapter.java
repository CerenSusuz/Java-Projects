package Adapters;

import java.rmi.RemoteException;

import Business.Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();

		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(
					Long.parseLong(user.getNationalityIdentifier()),
					user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(),
					user.getGetDateOfBirthYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}
}
