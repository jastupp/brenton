package test.java.app;

public abstract class TestBase <T> {

    private T mTestCase;

    protected abstract T createTestCase();

    protected T underTest() {
        return mTestCase == null ? mTestCase = createTestCase() : mTestCase;
    }
}
