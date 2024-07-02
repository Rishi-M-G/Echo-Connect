package EchoConnect;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bundle extends EchoConnect.Plan {
	public Bundle(int serviceID, String serviceName, Date startDate, Date endDate) {
		super(serviceID, serviceName, startDate, endDate);
		// TODO Auto-generated constructor stub
	}
	private List<WiFi> wifiPlans;
    private List<TV> tvSubscriptions;
    private List<Mobility> mobilityPlans;
	public int planCost;
    
    public void SubscriptionBundle() {
        this.wifiPlans = new ArrayList<>();
        this.tvSubscriptions = new ArrayList<>();
        this.mobilityPlans = new ArrayList<>();
    }
    public void addWifiPlan(WiFi wifiPlan) {
        this.wifiPlans.add(wifiPlan);
    }
    public void addTVSubscription(TV tvSubscription) {
        this.tvSubscriptions.add(tvSubscription);
    }
    public void addMobilityPlan(Mobility mobilityPlan) {
        this.mobilityPlans.add(mobilityPlan);
    }
    
    
	public int getPlanID() {
		// TODO Auto-generated method stub
		return 0;
	}
    
//    public void viewAllPlans() {
//        System.out.println("Wifi Plans:");
//        for (WiFi WiFiPlan : WiFi) {
//            System.out.println("-----------------------------");
//            WiFi.viewPlan(WiFi.getPlanID(), WiFi.getPlanName());
//        }
//        System.out.println("-----------------------------");
//        System.out.println("TV Subscriptions:");
//        for (TV tvSubscription : tvSubscriptions) {
//            System.out.println("-----------------------------");
//            tvSubscription.viewSubscription(tvSubscription.getSubscriptionID(), tvSubscription.getSubscriptionName());
//        }
//
//        System.out.println("-----------------------------");
//        System.out.println("Mobility Plans:");
//        for (MobilityPlan mobilityPlan : mobilityPlans) {
//            System.out.println("-----------------------------");
//            mobilityPlan.viewPlan(mobilityPlan.getPlanID(), mobilityPlan.getPlanName());
//        }
    };
