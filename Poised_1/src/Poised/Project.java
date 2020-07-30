package Poised;

//when option 1 chosen: To create a new project
public class Project {
    
    String Project_number;
    String Project_name;
    String Building_type;
    
    public Project() { }//default constructor
    
    public Project(String Project_number, String Project_name, String Building_type, String Project_phys_address, String ERF_number, Double Total_fee_charged, Double Total_paid_to_date, String Project_deadline) {
    	//each variable going th
    	setProject_number(Project_number);        
        setProject_name(Project_name);        
        setBuilding_type(Building_type);        
        setProject_phys_address(Project_phys_address);        
        setERF_number(ERF_number);        
        setTotal_fee_charged(Total_fee_charged);
        setTotal_paid_to_date(Total_paid_to_date);        
        setProject_deadline(Project_deadline);
    }
    
    public String getProject_number() {//get Project number
        return Project_number;
    }
    
    public String getProject_name() {//get Project name
        return Project_name;
    }
    
    public String getBuilding_type() { //get Building type
        return Building_type;
    }
    
    public String getProject_phys_address() {// get Project physical address
        return Project_phys_address;
    }
    
    public String getERF_number() {//get ERF number
        return ERF_number;
    }
    
    public Double getTotal_fee_charged() {//get Total fee charged for project
        return Total_fee_charged;
    }
    
    public Double getTotal_paid_to_date() {// get Total fee paid to date
        return Total_paid_to_date;
    }
    
    public String getProject_deadline() {//get project deadline
        return Project_deadline;
    }
    
    public String getFinalised() {//get Finalized or not
        return Finalised;
    }
    
    
    //Set each credential
    public void setProject_number(String Project_number) {
        this.Project_number = Project_number;
    }
    
    public void setProject_name(String Project_name) {
        this.Project_name = Project_name;
    }
    
    public void setBuilding_type(String Building_type) {
        this.Building_type = Building_type;
    }
    
    public void setProject_phys_address(String Project_phys_address) {
        this.Project_phys_address = Project_phys_address;
    }
    
    public void setERF_number(String ERF_number) {
        this.ERF_number = ERF_number;
    }
    
    public void setTotal_fee_charged(Double Total_fee_charged) {
        this.Total_fee_charged = Total_fee_charged;
    }
    
    public void setTotal_paid_to_date(Double Total_paid_to_date) {
        this.Total_paid_to_date = Total_paid_to_date;
    }
    
    public void setProject_deadline(String Project_deadline) {
        this.Project_deadline = Project_deadline;
    }
    
    public void setFinalised(String Finalised) {
        this.Finalised = Finalised;
    }
    
    String Project_phys_address;
    String ERF_number;
    Double Total_fee_charged;
    Double Total_paid_to_date;
    String Project_deadline;
    
    String Finalised = "";
    
    public Project(String Project_number, String Project_name, String Building_type, String Project_phys_address, String ERF_number, Double Total_fee_charged, Double Total_paid_to_date, String Project_deadline, String Finalised) {
        this.Project_number = Project_number;
        this.Project_name = Project_name;
        this.Building_type = Building_type;
        
        this.Project_phys_address = Project_phys_address;
        this.ERF_number = ERF_number;
        this.Total_fee_charged = Total_fee_charged;
        this.Total_paid_to_date = Total_paid_to_date;
        this.Project_deadline = Project_deadline;
        this.Finalised = Finalised;
        
    }
    
    public String getFinalised(String Finalised) {
        if (Finalised == "No") {
            return "No";
        } else {
            return "Yes";
        }
        
    }    
    
    public String toString() {
        String output = "Project information\n";
        output += "\nProject number: " + Project_number;
        output += "\nProject name: " + Project_name;
        output += "\nBuilding Type: " + Building_type;
        
        output += "\nProject physical address: " + Project_phys_address;
        output += "\nERF number: " + ERF_number;
        output += "\nTotal fee charged for project: R" + Total_fee_charged;
        output += "\nTotal amount paid to date: R" + Total_paid_to_date;
        output += "\nFinalised: " + this.getFinalised(Finalised);
        
        return output;
    }
    
}
