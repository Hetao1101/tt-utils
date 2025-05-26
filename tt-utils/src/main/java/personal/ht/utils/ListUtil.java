package personal.ht.utils;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * author: ht
 * create: 2025-05-20 14:38
 */
public class ListUtil {

    public static <T> List<T> emptyGetOther(List<T> list, Supplier<List<T>> otherList){
        if(list==null|| list.isEmpty()){
            return otherList.get();
        }
        return list;
    }
    public static <T,R> List<R> nonEmptyThenConvertItem(List<T> list, Function<T, R> convert){
        if(list==null|| list.isEmpty()){
            return Collections.emptyList();
        }
        return list.stream().map(convert).collect(Collectors.toList());
    }

}
