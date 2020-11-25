package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return (double) arrayList.stream().reduce(0, Integer::sum) / arrayList.size();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(0, (max, i) -> max = i > max ? i : max);
//        throw new NotImplementedException();
    }

    public int getLastOdd() {
        return arrayList.stream().reduce(0, (lastOdd, i) -> lastOdd = i % 2 == 1 ? i : lastOdd);
    }
}
