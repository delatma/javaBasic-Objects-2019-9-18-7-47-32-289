package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start

        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack[2].getClassName() + "." + stack[2].getMethodName();
/*
        StackTraceElement[] stack = new Throwable().getStackTrace();
        StackTraceElement ste = null;
        if (stack.length > 1)
            ste = stack[1];
        System.out.println(ste.getClassName()+ "   " + ste.getMethodName());
        return ste.getClassName()+ "." + ste.getMethodName();
*/
        // end-->
    }
}
