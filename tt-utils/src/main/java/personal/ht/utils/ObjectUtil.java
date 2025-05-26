package personal.ht.utils;

import java.util.Map;
import java.util.function.Supplier;

/**
 * author: ht
 * create: 2025-05-19 10:23
 */
public class ObjectUtil {
    public static <T> T equalsGetOrThrow(boolean expression, Supplier<T> successSupplier, RuntimeException exception) throws Exception {
        if(expression){
            try {
                return successSupplier.get();
            } catch (Throwable e) {
                exception.initCause(e);
                throw exception;
            }
        }
        throw exception;
    }
    public static <T> T equalsGetOrOther(boolean expression, Supplier<T> successSupplier, Supplier<T> other){
        if(expression){
            return successSupplier.get();
        }
       return other.get();
    }

    public static boolean nonNull(Object o) {
        return o != null;
    }

    public static void falseThenThrow(boolean expression, RuntimeException  exception ){
        if(!expression){
            throw exception;
        }
    }
    public static void nullThenThrow(Object o, RuntimeException  exception ){
        if(o==null){
            throw exception;
        }
    }
}
