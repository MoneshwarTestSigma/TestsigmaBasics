public class Main {
    public static void main(String[] args) {
        //Global Insurance
//        Insurance insurance=new Insurance() {
//            @Override
//            public void getDetails(InsuranceVisitors insuranceVisitors) {
//                insuranceVisitors.visit(this);
//            }
//        };
        Insurance insurance=new LifeInsurance();  //Depending on the object we create it will call the respective function achived with methord overloading
        insurance.getDetails(new InsuranceVisitors());
    }
}