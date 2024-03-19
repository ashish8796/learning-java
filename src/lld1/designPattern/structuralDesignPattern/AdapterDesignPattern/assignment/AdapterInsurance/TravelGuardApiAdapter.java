package designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdapterInsurance;

import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdapterInsurance.external.TravelGuardApi;

public class TravelGuardApiAdapter implements TravelInsuranceAdapter{
    private TravelGuardApi travelGuardApi = new TravelGuardApi();

    public void claimInsurance(String insuranceId,double amount) {
        travelGuardApi.submitClaim(insuranceId, amount);
    }

    public String checkClaimStatus(String insuranceId) {
        return travelGuardApi.getClaimStatus(insuranceId);
    }
}
