/*
 * TournamentParameterSet.java
 *
 */

package info.vannier.gotha;

/**
 *
 * @author Luc Vannier
 */
public class TournamentParameterSet implements java.io.Serializable{
    private static final long serialVersionUID = Gotha.GOTHA_DATA_VERSION;
    
    public final static int TYPE_UNDEFINED       = 0;
    public final static int TYPE_MACMAHON        = 1;
    public final static int TYPE_SWISS           = 2;
    public final static int TYPE_SWISSCAT        = 3;
    
    private GeneralParameterSet generalParameterSet = new GeneralParameterSet();
    private HandicapParameterSet handicapParameterSet = new HandicapParameterSet();
    private PlacementParameterSet placementParameterSet = new PlacementParameterSet();
    private PairingParameterSet pairingParameterSet = new PairingParameterSet();
    

    /** Creates a new instance of TournamentParameterSet */
    public TournamentParameterSet() {
    }
    
    /** Creates a new instance of TournamentParameterSet, tps' clone */
    public TournamentParameterSet(TournamentParameterSet tps) {
        generalParameterSet    = new GeneralParameterSet  (tps.getGeneralParameterSet());
        handicapParameterSet   = new HandicapParameterSet (tps.getHandicapParameterSet());
        placementParameterSet  = new PlacementParameterSet(tps.getPlacementParameterSet());
        pairingParameterSet    = new PairingParameterSet  (tps.getPairingParameterSet());
    }

    public int tournamentType(){    
        PlacementParameterSet pps = this.getPlacementParameterSet();
        if (pps == null) return TournamentParameterSet.TYPE_UNDEFINED;
        int[] plaCrit = pps.getPlaCriteria();
        if (plaCrit == null) return TournamentParameterSet.TYPE_UNDEFINED;
        switch(plaCrit[0]){
            case PlacementParameterSet.PLA_CRIT_MMS : return TournamentParameterSet.TYPE_MACMAHON;
            case PlacementParameterSet.PLA_CRIT_NBW : return TournamentParameterSet.TYPE_SWISS;
            case PlacementParameterSet.PLA_CRIT_CAT : return TournamentParameterSet.TYPE_SWISSCAT;
            default : return TournamentParameterSet.TYPE_UNDEFINED;
        }
    }

    public void initBase(){
        initBase("Undefined", "Undefined", "", new java.util.Date (),  new java.util.Date (), 5, 1);
    }
    
    public void initBase(String shortName, String name, String location,
            java.util.Date beginDate, java.util.Date endDate, int numberOfRounds,  int numberOfCategories) {
        generalParameterSet.initBase(shortName, name, location,
        beginDate, endDate, numberOfRounds,  numberOfCategories);
    }

    public void initForMM(){
        generalParameterSet.initForMM();
        handicapParameterSet.initForMM();
        placementParameterSet.initForMM();
        pairingParameterSet.initForMM();
    }

    public void initForSwiss(){
        generalParameterSet.initForSwiss();
        handicapParameterSet.initForSwiss();
        placementParameterSet.initForSwiss();
        pairingParameterSet.initForSwiss();
    }

    public void initForSwissCat(){
        generalParameterSet.initForSwissCat();
        handicapParameterSet.initForSwissCat();
        placementParameterSet.initForSwissCat();
        pairingParameterSet.initForSwissCat();
    }

    public HandicapParameterSet getHandicapParameterSet() {
        return handicapParameterSet;
    }

    public void setHandicapParameterSet(HandicapParameterSet handicapParameterSet) {
        this.handicapParameterSet = handicapParameterSet;
    }

    public PlacementParameterSet getPlacementParameterSet() {
        return placementParameterSet;
    }

    public void setPlacementParameterSet(PlacementParameterSet placementParameterSet) {
        this.placementParameterSet = placementParameterSet;
    }

    public PairingParameterSet getPairingParameterSet() {
        return pairingParameterSet;
    }

    public void setPairingParameterSet(PairingParameterSet pairingParameterSet) {
        this.pairingParameterSet = pairingParameterSet;
    }

    public GeneralParameterSet getGeneralParameterSet() {
        return generalParameterSet;
    }

    public void setGeneralParameterSet(GeneralParameterSet generalParameterSet) {
        this.generalParameterSet = generalParameterSet;
    }
    
}
