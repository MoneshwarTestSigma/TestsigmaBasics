public class ForTesting {
     void toCheckCase() throws TestCaseFailure {
        throw new TestCaseFailure("Test Case Failure occurred");
    }
    void toCheckPlan() throws TestPlanFailure {
        throw new TestPlanFailure("Test Plain Failure occurred");
    }
    void toCheckSuit() throws TestSuitFailure {
        throw new TestSuitFailure("Test Suit Failure occurred");
    }

}
