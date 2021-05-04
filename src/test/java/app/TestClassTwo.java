package test.java.app;

import main.java.app.ClassTwo;

public class TestClassTwo extends TestBase<ClassTwo> {

    public void testMethod() {
        // All calls within method are on single instance
        underTest().methodTwo();
        underTest().methodTwo();
        underTest().methodTwo();
        underTest().methodTwo();
    }

    @Override
    protected ClassTwo createTestCase() { return new ClassTwo(); }
}