package Abstracts;

import Entities.Gamer;

public interface IGamerService {
	
	void log(Gamer gamer);
	void exit(Gamer gamer);
	void update(Gamer gamer);

}
