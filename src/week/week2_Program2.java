package week;

import java.sql.SQLOutput;

public class week2_Program2 {
    public static void main(String args[]){
        byte byteVal = 42;
        short shortVal = byteVal;
        int intVal = shortVal;

        System.out.println("Implicit Conversion:");
        System.out.println("byte to short:"+shortVal);
        System.out.println("short to int: "+intVal);

        double d = 123.46;
        float f = (float) d;
        long l = (long) f;

        System.out.println("\nExplicit Conversion:");
        System.out.println("double to float: " + f);
        System.out.println("float to long: " + l);
    }
}
