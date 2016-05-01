package pokerBase;

import pokerEnums.eAction;
import pokerEnums.eGame;

import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Action implements Serializable {

	@XmlElement
	private eAction eAction;

	@XmlElement
	private Player ActPlayer;
	
	public Action()
	{
		
	}
	public Action(eAction eAction, Player player) {
		super();
		this.eAction = eAction;
		this.ActPlayer = player;
	}


	public eAction getAction() {
		return eAction;
	}
	
	public void setAction(eAction action) {
		eAction = action;
	}
	public Player getPlayer() {
		return ActPlayer;
	}
	public void setPlayer(Player player) {
		this.ActPlayer = player;
	}
	public void seteGame(eGame game) {
		// TODO Auto-generated method stub
		
	}
	
}
