// Person.aidl
package yy.chen.ipc;

// Declare any non-default types here with import statementsP
parcelable Person;
interface Person {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);
}
