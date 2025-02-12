package Week05TeamMenuApp;

import java.util.ArrayList;
import java.util.List;

public class Team { //a team will have a list of players
	
	List<Player> players = new ArrayList<Player>(); //array list to hold all players per team
	
	private String name;
	
	public Team(String name) {
		this.setName(name);
	}
	
	
	//public methods

	public void describe() {
		System.out.println("Team name: " + name);
		for (Player player : players) { //iterating on every added player and describing them
			player.describe();
		}
	}
	
	public void addPlayer(Player player) { //adding players
		players.add(player);
	}
	
	public void removePlayer(String playerName) {
		for (Player player : players) {
			if (player.getName().equals(playerName)) {
				players.remove(player);
			}
		}
	}
	
	
	
	
	
	
	
	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
