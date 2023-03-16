public class Main {
    public static void main(String[] args) {
       ForTesting forTesting=new ForTesting();
       try{
           forTesting.toCheckCase();
       }
       catch (TestCaseFailure tc)
       {
           System.out.println(tc);
       }
       catch(TestSuitFailure ts)
       {
           System.out.println(ts);
       }
       catch(TestPlanFailure tp)
       {
           System.out.println(tp);
       }
       catch (Exception e)
       {
           System.out.println(e);
       }

        try{
            forTesting.toCheckSuit();
        }
        catch (TestCaseFailure tc)
        {
            System.out.println(tc);
        }
        catch(TestSuitFailure ts)
        {
            System.out.println(ts);
        }
        catch(TestPlanFailure tp)
        {
            System.out.println(tp);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        try{
            forTesting.toCheckPlan();
        }
        catch (TestCaseFailure tc)
        {
            System.out.println(tc);
        }
        catch(TestSuitFailure ts)
        {
            System.out.println(ts);
        }
        catch(TestPlanFailure tp)
        {
            System.out.println(tp);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}