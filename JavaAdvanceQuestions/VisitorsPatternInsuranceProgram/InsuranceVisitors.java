class InsuranceVisitors {
    void visit(HealthInsurance healthInsurance) {
        System.out.println("This is Health Insurance");
    }

    void visit(LifeInsurance lifeInsurance) {
        System.out.println("This is Life Insurance");
    }

    void visit(BikeInsurance bikeInsurance) {
        System.out.println("This is Bike Insurance");
    }

    void visit(Insurance insurance) {
        System.out.println("This is Global Insurance");
    }
}
