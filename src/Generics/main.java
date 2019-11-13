package Generics;

public class main {

	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		adelaideCrows.addPlayer(joe);
		
		System.out.println(adelaideCrows.numPlayers());
		
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Club");
		baseballTeam.addPlayer(pat);
		
		Team<SoccerPlayer> soccerTeam = new Team<>("Chelsea Club");
		soccerTeam.addPlayer(beckham);
		
		Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");
		
		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(adelaideCrows, 3, 8);
		
		adelaideCrows.matchResult(fremantle, 2, 1);
		
		System.out.println();
	}
}