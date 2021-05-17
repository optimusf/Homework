package intro;

import java.time.LocalDate;

import Abstracts.IGameService;
import Abstracts.ISaleService;
import Adapters.MernisServiceManager;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new MernisServiceManager());
		gamerManager.log(new Gamer(1, "Fatmagül", "Dursun", LocalDate.of(2001, 03, 18), "41926878410"));
		
		System.out.println("---");
		
		IGameService iGameService = new GameManager();
		iGameService.add(new Game(2, "Warframe", 50));
		
		System.out.println("---");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(50, "Summer SALE"));
		
		System.out.println("---");
		
		ISaleService iSaleService = new SaleManager();
		iSaleService.saleWithCamp(new Game(3, "Warzone", 50), new Gamer(4, "xx", "yy", LocalDate.of(2001, 03, 18),
				"41926878410"), new Campaign(50, "Summer SALE"));

	}

}
