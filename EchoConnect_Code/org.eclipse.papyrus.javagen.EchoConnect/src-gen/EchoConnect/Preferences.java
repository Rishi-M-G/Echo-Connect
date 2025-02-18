// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package EchoConnect;

import java.util.Arrays;

/************************************************************/
/**
 * 
 */
public class Preferences {

	public int PreferenceID;
	public String PreferenceName;
    public String[] Options;
    private String selectedOption;

    public Preferences(int preferenceID, String preferenceName, String[] options) {
        PreferenceID = preferenceID;
        PreferenceName = preferenceName;
        Options = options;
    }

    public void SetPreference(String selectedOption) {
        if (isValidOption(selectedOption)) {
            System.out.println("Preference '" + PreferenceName + "' set to: " + selectedOption);
        } else {
            System.out.println("Invalid option for preference '" + PreferenceName + "'.");
        }
    }

    public boolean isValidOption(String selectedOption) {
        for (String option : Options) {
            if (option.equalsIgnoreCase(selectedOption)) {
                return true;
            }
        }
        return false;
    }
    
    public String GetCurrentPreference() {
        if (selectedOption != null) {
            return selectedOption;
        } else {
            System.out.println("No preference set for '" + PreferenceName + "'. Using default.");
            return getDefaultOption();
        }
    }

    public void DisplayAvailableOptions() {
        System.out.println("Available options for preference '" + PreferenceName + "': " +
                Arrays.toString(Options));
    }

    public String getDefaultOption() {
        // Provide a default option if none is selected
        if (Options.length > 0) {
            return Options[0];
        } else {
            System.out.println("No available options for preference '" + PreferenceName + "'.");
            return "";
        }

    }}
