package com.joseph.designpatterns.templatemethod.practice.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ListUtil {
    private ListUtil(){}

    public static boolean isEmpty(Collection<?> collection){
        return collection == null || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }

    public static <T> List<List<T>> splitList(List<T> allList, int batch_size){
        List<List<T>> ret = new ArrayList();
        for(int from = 0, to=0, size = allList.size(); from < size; from = to){
            to = Math.min( from + batch_size, size);
            List subList = allList.subList(from, to);
            ret.add(subList);
        }
        return ret;
    }
}
