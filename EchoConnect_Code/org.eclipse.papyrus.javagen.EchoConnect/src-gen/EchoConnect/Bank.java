// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package EchoConnect;

/************************************************************/
/**
 * 
 */
public class Bank {
	/**
	 * 
	 */
	public int AccountNumber;
	/**
	 * 
	 */
	public String BankName;
	/**
	 * 
	 */
	public String AccHolderName;

	/**
	 * 
	 */
	public void SaveAccInfo() {
		System.out.println("Acc Info Saved");
	}

	/**
	 * 
	 */
	public void ValidateAccInfo() {
		System.out.println("Validating Bank Info");
	}

	/**
	 * 
	 */
//	public void RedirectToBank() {
//	}
	static void RedirectToVendor (String vendorName)
	{
		System.out.println("Redirecting to "+ vendorName + " webpage");
		
	}
}
