package EchoConnect;

public class WiFi extends EchoConnect.Plan
{
	public int planCost;
	public String planDescription;
	public String planName;
	public int planID;
	public int speed;
	public int dataLimit;

    // Function to view plan based on PlanID and PlanName
    public void viewPlan(int inputPlanID, String inputPlanName) {
        if (this.planID == inputPlanID && this.planName.equals(inputPlanName)) {
            System.out.println("Plan ID: " + planID);
            System.out.println("Plan Name: " + planName);
            System.out.println("Plan Cost: " + planCost);
            System.out.println("Plan Description: " + planDescription);
            System.out.println("Speed: " + speed + " Mbps");
            System.out.println("Data Limit: " + dataLimit + " GB");
        } else {
            System.out.println("Plan not found.");
        }
    }

     // Function to check data usage
    public void checkDataUsage(int usage) {
        if (usage >= this.dataLimit) {
            System.out.println("You have exceeded the data limit. Additional charges may apply.");
        } else {
            System.out.println("Data usage within limits.");
        }
    }
    
    
    // Constructor
    public WiFi(int planID, String planName, int planCost, String planDescription, int speed, int dataLimit) {
        this.planID = planID;
        this.planName = planName;
        this.planCost = planCost;
        this.planDescription = planDescription;
        this.speed = speed;
        this.dataLimit = dataLimit;
    }
    

	public int getPlanID() {
		// TODO Auto-generated method stub
		return planID;
	}

	public  String getPlanName() {
		// TODO Auto-generated method stub
		return planName;
	}

};
