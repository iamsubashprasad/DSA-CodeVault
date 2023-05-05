package LeetCode_Practise;

public class CountofMatchesinTournament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int NoOfTeam = 6;
		int Matchsum = 0;
		int Matches =1;
		
		while(Matches>=1) {
		if (NoOfTeam%2==0) {
			 Matches = NoOfTeam/2;
			int TeamAdvances = NoOfTeam/2;
		}
		else {
			 Matches = (NoOfTeam-1)/2;
			int TeamAdvances = (NoOfTeam-1)/2+1;
			
		}
		}

	}

}
