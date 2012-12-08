package info.vannier.gotha;

/**
 * Display and ParameterSet
 * @author Luc
 */
public class DPParameterSet implements java.io.Serializable{
    private static final long serialVersionUID = Gotha.GOTHA_DATA_VERSION;
    
    public final static int DP_GAME_FORMAT_SHORT = 0;
    public final static int DP_GAME_FORMAT_FULL = 2;
    
    private int gameFormat = DP_GAME_FORMAT_FULL;
        
    private boolean displayNumCol = true;
    private boolean displayPlCol  = true;
  
    private boolean displayIndGamesInMatches  = true;   // Display Individual Games (and not only Team matches)
    
    public DPParameterSet() {             
    }
     
    public DPParameterSet(DPParameterSet dpps) { 
        this.gameFormat = dpps.gameFormat;
        this.displayNumCol = dpps.displayNumCol;
        this.displayPlCol = dpps.displayPlCol;
        this.displayIndGamesInMatches = dpps.displayIndGamesInMatches;
    }
    
    public void initForMM(){
        this.gameFormat = DPParameterSet.DP_GAME_FORMAT_FULL;
        this.displayNumCol = true;
        this.displayPlCol = true;
        this.displayIndGamesInMatches = true;
    }
    
    public void initForSwiss(){
        this.gameFormat = DPParameterSet.DP_GAME_FORMAT_SHORT;
        this.displayNumCol = true;
        this.displayPlCol = true;
        this.displayIndGamesInMatches = true;
    }
    
    public void initForSwissCat(){
        this.gameFormat = DPParameterSet.DP_GAME_FORMAT_FULL;
        this.displayNumCol = true;
        this.displayPlCol = true;
        this.displayIndGamesInMatches = true;
    }

    /**
     * @return the gameFormat
     */
    public int getGameFormat() {
        return gameFormat;
    }

    /**
     * @param gameFormat the gameFormat to set
     */
    public void setGameFormat(int gameFormat) {
        this.gameFormat = gameFormat;
    }

    /**
     * @return the displayNumCol
     */
    public boolean isDisplayNumCol() {
        return displayNumCol;
    }

    /**
     * @param displayTeamNumCol the displayTeamNumCol to set
     */
    public void setDisplayNumCol(boolean displayTeamNumCol) {
        this.displayNumCol = displayTeamNumCol;
    }

    /**
     * @return the displayTeamPlCol
     */
    public boolean isDisplayPlCol() {
        return displayPlCol;
    }

    /**
     * @param displayTeamPlCol the displayTeamPlCol to set
     */
    public void setDisplayPlCol(boolean displayTeamPlCol) {
        this.displayPlCol = displayTeamPlCol;
    }

    /**
     * @return the displayIndGamesInMatches
     */
    public boolean isDisplayIndGamesInMatches() {
        return displayIndGamesInMatches;
    }

    /**
     * @param displayIndGamesInMatches the displayIndGamesInMatches to set
     */
    public void setDisplayIndGamesInMatches(boolean displayIndGamesInMatches) {
        this.displayIndGamesInMatches = displayIndGamesInMatches;
    }

}
