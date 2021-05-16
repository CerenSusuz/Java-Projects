package Core.Adapters;

import Business.Concrete.GoogleManager;

public class GoogleAdapter implements Google{
	GoogleManager googleManager = new GoogleManager();
	public void login() {
		googleManager.loginviaGoogle();
	}
}
