package Concrete;

import Abstracts.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements ISaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + "has purchased the game" + game.getName());
		
	}

	@Override
	public void saleWithCamp(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + "game was purchased by " + gamer.getFirstName() + gamer.getLastName() +
				"person with a discount of" + campaign.getDiscount() + "to 100");
	}
	
	

}
