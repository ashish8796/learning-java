package designPattern.structuralDesignPattern.AdapterDesignPattern.assignment.AdapterInsurance;

public interface TravelInsuranceAdapter {
    public void claimInsurance(String insuranceId,double amount);
    public String checkClaimStatus(String insuranceId);
}
