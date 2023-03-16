class LifeInsurance implements Insurance {

    @Override
    public void getDetails(InsuranceVisitors insuranceVisitors) {
        insuranceVisitors.visit(this);
    }
}
