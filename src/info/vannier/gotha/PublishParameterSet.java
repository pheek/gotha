package info.vannier.gotha;

/**
 * Display and Print ParameterSet
 * @author Luc
 */
public class PublishParameterSet implements java.io.Serializable{   
    private boolean print = true;
    private boolean exportToLocalFile   = true;
    private boolean exportToOGSite = false;
    private boolean exportToUDSite = false;

    public PublishParameterSet() {             
    }
     
    public PublishParameterSet(PublishParameterSet dpps) { 

    }
    
    public void initForMM(){
        commonInit();
    }
    
    public void initForSwiss(){
        commonInit();
    }
    
    public void initForSwissCat(){
        commonInit();
    }
    
    public void commonInit(){
        this.print = true;
        this.exportToLocalFile = true;
        this.exportToOGSite = false;
        this.exportToUDSite = false;
    }

    /**
     * @return the print
     */
    public boolean isPrint() {
        return print;
    }

    /**
     * @param print the print to set
     */
    public void setPrint(boolean print) {
        this.print = print;
    }

    /**
     * @return the exportToLocalFile
     */
    public boolean isExportToLocalFile() {
        return exportToLocalFile;
    }

    /**
     * @param exportToLocalFile the exportToLocalFile to set
     */
    public void setExportToLocalFile(boolean exportToLocalFile) {
        this.exportToLocalFile = exportToLocalFile;
    }

    /**
     * @return the exportToOGSite
     */
    public boolean isExportToOGSite() {
        return exportToOGSite;
    }

    /**
     * @param exportToOGSite the exportToOGSite to set
     */
    public void setExportToOGSite(boolean exportToOGSite) {
        this.exportToOGSite = exportToOGSite;
    }

    /**
     * @return the exportToUDSite
     */
    public boolean isExportToUDSite() {
        return exportToUDSite;
    }

    /**
     * @param exportToUDSite the exportToUDSite to set
     */
    public void setExportToUDSite(boolean exportToUDSite) {
        this.exportToUDSite = exportToUDSite;
    }

}
