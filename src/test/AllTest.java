package test;

import test.unit.ServiceFunctionTest;
import test.unit.StringConverterTest;

public class AllTest {
    public static void main(String[] args) {
        new ServiceFunctionTest().testPrintTextEquals();
        new ServiceFunctionTest().testGetStringWithPrintedTextEquals();
        StringConverterTest stringConverterTest = new StringConverterTest();
        stringConverterTest.test1rub();
        stringConverterTest.test2357rub();
        stringConverterTest.test1246892rub();
        stringConverterTest.testLoverMinValue();
        stringConverterTest.testBiggerMaxValue();
    }
}
