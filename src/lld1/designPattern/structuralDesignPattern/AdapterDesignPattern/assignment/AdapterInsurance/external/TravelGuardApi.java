package designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdapterInsurance.external;

import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdapterInsurance.ApiUtils;

public class TravelGuardApi {
    public void submitClaim(String id, Double amount) {
        ApiUtils.logTravelGuardClaimCall();
    }

    public String getClaimStatus(String id) {
        ApiUtils.logTravelGuardStatusCall();
        return "SUCCESS";
    }
}
