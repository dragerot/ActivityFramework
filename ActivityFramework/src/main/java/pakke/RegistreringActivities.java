package pakke;

import pakke.process.Aktivities;

import java.util.ArrayList;

public class RegistreringActivities extends Aktivities<Request> {
    ArrayList<String> activitylog = new  ArrayList<String>();

    public ArrayList<String> getActivitylog() {
        return activitylog;
    }

    public RegistreringActivities(Request request){
        super(request);
    }

    public RegistreringActivities doA(String arg){
        activitylog.add(arg);
        return this;
    }
    public RegistreringActivities doB(String arg){
        activitylog.add(arg);
        return this;
    }

    public RegistreringActivities doC(String arg){
        activitylog.add(arg);
        return this;
    }
}
