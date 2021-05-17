package Concrete;

import Abstracts.IGamerCheckService;
import Abstracts.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService {

	private IGamerCheckService iGamerCheckService;

	public GamerManager(IGamerCheckService iGamerCheckService) {
		super();
		this.iGamerCheckService = iGamerCheckService;
	}

	@Override
	public void log(Gamer gamer) {

		if (iGamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Logged into the system : " + gamer.getFirstName() + gamer.getLastName());
		} else {
			System.out.println("Not a valid user");
		}
	}

	@Override
	public void exit(Gamer gamer) {
		System.out.println("Logged out of the system : " + gamer.getFirstName() + gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("User information has been updated : " + gamer.getFirstName() + gamer.getLastName());

	}

}
