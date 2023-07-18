package test;

import test.unit.ServiceFunctionTest;

public class AllTest {
    public static void main(String[] args) {
        new ServiceFunctionTest().testPrintTextEquals();
        new ServiceFunctionTest().testGetStringWithPrintedTextEquals();
    }
}
