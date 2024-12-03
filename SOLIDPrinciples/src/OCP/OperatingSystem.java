package OCP;

import java.util.HashMap;
import java.util.Map;

// Core OS class (Closed for modification)
public class OperatingSystem {
   // private boolean isDarkModeEnabled = false;
    private Map<String, IFeature> features = new HashMap<>(); 
    public void callFunction(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    public void messageFunction(String phoneNumber, String message) {
        System.out.println("Sending message to " + phoneNumber + ": " + message);
    }

    public void addFeature(String featureName, IFeature feature) {
        features.put(featureName, feature); 
        System.out.println(featureName + " feature added.");
    }

    public void accessFeature(String featureName) {
        IFeature feature = features.get(featureName);
        if (feature != null) {
            feature.applyFeature(this);
        } else {
            System.out.println("Feature '" + featureName + "' not found.");
        }
    }

   
}
