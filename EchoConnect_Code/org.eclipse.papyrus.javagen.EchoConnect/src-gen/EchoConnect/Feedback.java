// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package EchoConnect;

import java.util.ArrayList;
import java.util.List;

/************************************************************/
/**
 * 
 */
public class Feedback {
	/**
	 * 
	 */
	
	private List<String> customerFeedback;

    public Feedback() {
        this.customerFeedback = new ArrayList<>();
    }
    
    public List<String> getCustomerFeedback() {
        return customerFeedback; //getter
    }
	//public EEList Customer_Feedback;

	/**
	 * 
	 */
	public void GiveFeedback(String feedback) {
		customerFeedback.add(feedback);
        System.out.println("Your response is saved, Thank you!");
	}
}
