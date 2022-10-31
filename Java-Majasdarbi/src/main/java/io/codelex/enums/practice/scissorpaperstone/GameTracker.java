package io.codelex.enums.practice.scissorpaperstone;

public class GameTracker {

    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;

    public GameTracker(int gamesPlayed, int gamesWon, int gamesLost) {
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
    }

    public void tieGame() {
        this.gamesPlayed++;
    }

    public void wonGame() {
        this.gamesWon++;
        this.gamesPlayed++;
    }

    public void lostGame() {
        this.gamesLost++;
        this.gamesPlayed++;
    }

    public void gameStatistics() {
        double winPercent = ((double) gamesWon / (double) gamesPlayed) * 100.0;
        double lossPercent = ((double) gamesLost / (double) gamesPlayed) * 100.0;
        double tiedPercent = 100.0 - lossPercent - winPercent;
        winPercent = Math.round(winPercent * 100.0) / 100.0;
        lossPercent = Math.round(lossPercent * 100.0) / 100.0;
        System.out.println("You have played: " + gamesPlayed + " games");
        System.out.println("You have won " + winPercent + "% of those games");
        System.out.println("Lost " + lossPercent + "% of them!");
        System.out.println("And tied " + tiedPercent + "% of the games!");
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }
}
