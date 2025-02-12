package Week05TeamMenuApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {
	
	static Scanner scanner = new Scanner (System.in);
	
	static List<Team> teams = new ArrayList<Team>(); //array to hold the teams

	public static void main(String[] args) {
		
		int decision = 0;
		
		while (true) { //while loop to keep the app going. Decisions will be made using numbers 1-4
			printOptions();
			decision = scanner.nextInt();
			
			if (decision == 1) {
				teams.add(createNewTeam());
			} else if (decision == 2) {
				addPlayerToTeam();
			} else if (decision == 3) {
				removePlayerFromTeam();
			} else if (decision == 4) {
				describeTeam();
			} else {
				System.out.println("Please Pick a Valid Option!");
			}
		} //end of while loop
		
		/*
		 * Created to test out Team and Player classes
		 * 
		Player p1 = new Player("Thomas", "Full Back", "Running Fast");
		Player p2 = new Player("Sally", "Quarterback", "Throwing Far");
		
		Team team = new Team("Really Good Football Team!");
		
		//adding players to Team, then describing them
		team.addPlayer(p1);
		team.addPlayer(p2);
		team.describe();
		
		//calling on describe method to describe player 1
		//p1.describe();
		
		team.removePlayer("Thomas"); //Remove a player by name, then describing the team
		System.out.println("\n-------------------------------------");
		
		team.describe();
		*
		*
		*/
		
		

	} //end of main
	

	//Methods

	private static void printOptions() { //Printing Menu to start the app
		System.out.println("1) Create New Team");
		System.out.println("2) Add New Player To Team");
		System.out.println("3) Remove Player From Team");
		System.out.println("4) View Team Info");	
	}
	
	private static void describeTeam() { //describe method
		printTeamNames();
		System.out.print("Which team would you like to see the info for?");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private static Team createNewTeam() { //create new team method from decision menu
		System.out.print("Enter name of the team you want to create:");
		String name = scanner.next();
		return new Team(name);	
	}
	
	private static void addPlayerToTeam() { //add player to team method from decision menu
		printTeamNames(); //print player name so we know which players are already added
		System.out.print("Enter the name of the team you wish to add a player to: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.addPlayer(createNewPlayer());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static void removePlayerFromTeam() { //remove player from team from decision menu
		printTeamNames(); //print team name so we know which to choose
		System.out.print("Enter the name of the team you wish to remove a player from:");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
			System.out.print("Which player would you like to remove?");
			String playerName = scanner.next();
			foundTeam.removePlayer(playerName);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private static Player createNewPlayer() { //create new player method from decision menu
		System.out.println("Enter player name: ");
		String name = scanner.next();
		System.out.println("Enter player position: ");
		String position = scanner.next();
		System.out.println("Enter player specialty: ");
		String specialty = scanner.next();
		
		return new Player(name, position, specialty);
	}
	
	private static void printTeamNames() {
		for (Team team: teams) {
			System.out.println(team.getName());
		}
	}
	
	private static Team findTeamByName(String name) throws Exception {
		for (Team team : teams) {
			if (team.getName().equals(name)) {
				return team;
			}
		}
		throw new Exception("Team: " + name + " Not Found!");
	}
	
	
	//end of methods	

} //end of class
