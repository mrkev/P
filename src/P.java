/*
 */

import java.lang.reflect.Array;
import java.util.HashMap;

/**
 * P for printing when prototyping. Utility class useful when coding/debugging. By printing 
 * through a single class we can turn off all System.outs at once.
 * @author Kevin
 */
public class P {
    static public boolean rototyping = true;
    static public HashMap<String, Boolean> ermitted  = new HashMap();
    
    /**
     * Prints object to console if Prototyping.
     * @param obj The object to print
     */
    public static void rint(Object obj) {
        if (!rototyping) return;
        if (obj == null) System.out.println("null");
        if (!obj.getClass().equals(String.class)) {
            System.out.println(obj.toString());
        } else {
            System.out.println(obj);
        }   System.out.println();
    }
    
    /**
     * Prints object if key is in filter (P.ermitted). If filter is null,
     * acts just as P.rint(String s);
     * @param obj The object to print.
     * @param key The key with which the object is filtered.
     */
    public static void rint(Object obj, String key) {
        if (!rototyping) return;
        if (ermitted == null) {P.rint(obj); return;}
        if (ermitted.get(key) == null) return;
        if (!obj.getClass().equals(String.class)) {
            System.out.println(obj.toString());
        } else {
            System.out.println(obj);
        }   System.out.println();
    }
    
    public static Boolean[] ermitAll(String[] keys) {
        final Boolean[] rvals = new Boolean[keys.length];
        for (int i = 0; i < keys.length; i++) {
            rvals[i] = P.ermitted.put(keys[i], Boolean.TRUE);
        }
        return rvals;
    }
    
    public static Boolean[] rohibitAll(String[] keys) {
        final Boolean[] rvals = new Boolean[keys.length];
        for (int i = 0; i < keys.length; i++) {
            rvals[i] = P.ermitted.put(keys[i], Boolean.FALSE);
        }
        return rvals;
    }
}

