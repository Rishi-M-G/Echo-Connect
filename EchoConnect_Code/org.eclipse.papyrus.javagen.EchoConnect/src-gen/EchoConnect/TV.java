package EchoConnect;

import java.util.Date;

public class TV extends EchoConnect.Plan {
	public int planCost;
	public String planDescription;
	public String planName;
	public int planID;
	private int numberOfChannels;
    private boolean hdChannels;
    // Function to view subscription details based on planID and planName
    public void viewSubscription(int inputplanID, String inputplanName) {
        if (this.planID == inputplanID && this.planName.equals(inputplanName)) {
            System.out.println("Plan ID: " + planID);
            System.out.println("Plan Name: " + planName);
            System.out.println("Plan Cost: " + planCost);
            System.out.println("Plan Description: " + planDescription);
            System.out.println("Number of Channels: " + numberOfChannels);
            System.out.println("HD Channels Included: " + (hdChannels ? "Yes" : "No"));
        } else {
            System.out.println("Subscription not found.");
        }
    }
    // Function to modify subscription details
    public void modifySubscription(int newplanCost, String newplanDescription, int newNumberOfChannels, boolean newHdChannels) {
        this.planCost = newplanCost;
        this.planDescription = newplanDescription;
        this.numberOfChannels = newNumberOfChannels;
        this.hdChannels = newHdChannels;
        System.out.println("Subscription details updated successfully.");
    }

    // Function to check channel availability
    public void checkChannelAvailability(String channelName) {
        // For demonstration, let's assume you have a list of channels stored in an array.
        String[] availableChannels = {"CNN", "BBC", "ESPN", "Discovery", "National Geographic", "HBO"};

        // Check if the provided channelName exists in the availableChannels array
        for (String channel : availableChannels) {
            if (channel.equalsIgnoreCase(channelName)) {
                System.out.println("Channel '" + channelName + "' is accessible with this subscription.");
            }
        }

        // If channelName is not found in availableChannels array
        System.out.println("Channel '" + channelName + "' is not accessible with this subscription.");
    }
    // Function to toggle HD channels
    public void toggleHDChannels() {
        this.hdChannels = !this.hdChannels;
        System.out.println("HD Channels toggled: " + (hdChannels ? "On" : "Off"));
    }
    
 // Constructor
    public TV(int planID, String planName, int planCost, String planDescription, int numberOfChannels, boolean hdChannels) {
        this.planID = planID;
        this.planName = planName;
        this.planCost = planCost;
        this.planDescription = planDescription;
        this.numberOfChannels = numberOfChannels;
        this.hdChannels = hdChannels;
    }

	

public int getServiceID() {
	// TODO Auto-generated method stub
	return 0;
}

public String getServiceName() {
	// TODO Auto-generated method stub
	return null;
}

public Date getStartDate() {
	// TODO Auto-generated method stub
	return null;
}

public int getSubscriptionID() {
	// TODO Auto-generated method stub
	return planID;
}

public int getPlanID() {
	// TODO Auto-generated method stub
	return 0;
}

};
