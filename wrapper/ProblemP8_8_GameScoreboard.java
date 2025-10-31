public class ProblemP8_8_GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {150, 95, null, 210, 80, null, 175};
        
        int playersNotPlayed = 0;
        int totalValidScore = 0;
        
        for (Integer score : scores) {
            if (score == null) {
                playersNotPlayed++;
            } else {
                totalValidScore += score;
            }
        }
        
        System.out.println("Player Scores: " + java.util.Arrays.toString(scores));
        System.out.println("Players who haven't played: " + playersNotPlayed);
        System.out.println("Total score of active players: " + totalValidScore);
    }
}