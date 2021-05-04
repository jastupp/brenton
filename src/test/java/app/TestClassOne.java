package test.java.app;

import main.java.app.ClassOne;

public class TestClassOne extends TestBase<ClassOne> {

    public void testMethod() {
        // All calls within method are on single instance
        underTest().methodOne();
        underTest().methodOne();
        underTest().methodOne();
        underTest().methodOne();
    }

    @Override
    protected ClassOne createTestCase() { return new ClassOne(); }
}
