package EchoConnect;

public class Mobility extends EchoConnect.Plan{
	public int planCost;
	public String planDescription;
	public String planName;
	public int talkTime;
	public int sms;
	public int data;
	public int planID;

   
    // Function to view plan based on PlanID and PlanName
    public void viewPlan(int inputPlanID, String inputPlanName) {
        if (this.planID == inputPlanID && this.planName.equals(inputPlanName)) {
            System.out.println("Plan ID: " + planID);
            System.out.println("Plan Name: " + planName);
            System.out.println("Plan Cost: " + planCost);
            System.out.println("Plan Description: " + planDescription);
            System.out.println("Talk Time: " + talkTime);
            System.out.println("SMS: " + sms);
            System.out.println("Data: " + data);
        } else {
            System.out.println("Plan not found.");
        }
    }
    public void modifySubscription(int newPlanCost, String newPlanDescription, int newTalkTime, int newSMS, int newData) {
        System.out.println("Modifying Mobility Plan...");
        this.planCost = newPlanCost;
        this.planDescription = newPlanDescription;
        this.talkTime = newTalkTime;
        this.sms = newSMS;
        this.data = newData;
        System.out.println("Subscription modified successfully.");
    }
    
    public Mobility(int planID, String planName, int planCost, String planDescription, int talkTime, int sms, int data) {
        this.planID = planID;
        this.planName = planName;
        this.planCost = planCost;
        this.planDescription = planDescription;
        this.talkTime = talkTime;
        this.sms = sms;
        this.data = data;
    }


	public int getPlanID() {
		// TODO Auto-generated method stub
		return planID;
	}

};
