package day5Hw1.core;

import day5Hw1.RegisterViaGoogle.RegisterViaGoogleManager;

public class RegisterViaGoogleAdapter implements RegisterService{

	@Override
	public void register() {
		RegisterViaGoogleManager manager =new RegisterViaGoogleManager();
		manager.registerWithGoogle();
		
		
	}

}
