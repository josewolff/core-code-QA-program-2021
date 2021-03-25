package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CoreCodeListerner implements ISuiteListener, ITestListener {

    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite started");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Suite finished");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getMethod().getDescription());
        for (int i = 0; i < result.getParameters().length; i++){
            System.out.println(result.getParameters()[i].toString());
        }

    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }
}
