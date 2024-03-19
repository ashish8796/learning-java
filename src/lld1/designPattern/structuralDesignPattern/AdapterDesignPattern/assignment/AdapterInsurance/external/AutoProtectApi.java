package designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdapterInsurance.external;

import designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdapterInsurance.ApiUtils;

public class AutoProtectApi {
    public void addClaim(Double amount) {
        ApiUtils.logAutoProtectClaimCall();
    }

    public AutoProtectStatus getStatus(String id) {
        ApiUtils.logAutoProtectStatusCall();
        return AutoProtectStatus.APPROVED;
    }
}
