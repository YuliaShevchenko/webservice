package webservice;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class WebServiceRunner {
    public static void main (String[] args){
        Result result = JUnitCore.runClasses(WebServiceSuite.class);
        List<Failure> failures = result.getFailures();
        int runCount = result.getRunCount();
        int numOfTestsFailed = failures.size();
        int numOfTestsPassed = runCount - numOfTestsFailed;
        System.out.println("Total count: " + runCount);
        System.out.println("Passed: " + numOfTestsPassed);
        System.out.println("Failed: " + numOfTestsFailed );
        for (Failure failure : failures) {
            System.out.println(failure.getMessage());
        }
    }
}
