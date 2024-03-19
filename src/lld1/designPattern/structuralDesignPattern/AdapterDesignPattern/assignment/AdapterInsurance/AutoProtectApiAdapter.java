package designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdapterInsurance;

import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdapterInsurance.external.AutoProtectApi;
import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdapterInsurance.external.AutoProtectStatus;

public class AutoProtectApiAdapter implements TravelInsuranceAdapter{
    private AutoProtectApi autoProtectApi = new AutoProtectApi();

    public void claimInsurance(String insuranceId,double amount) {
        autoProtectApi.addClaim(amount);
    }

    public String checkClaimStatus(String insuranceId) {
        AutoProtectStatus claimStatus = autoProtectApi.getStatus(insuranceId);
        return claimStatus.toString();
    }
}
