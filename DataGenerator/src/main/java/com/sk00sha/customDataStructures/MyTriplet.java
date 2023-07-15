package com.sk00sha.customDataStructures;

import lombok.Getter;

import java.util.Objects;
@Getter
public class MyTriplet<T1,T2,T3>{
    private T1 firstValue;
    private T2 secondValue;
    private T3 thirdValue;

    public MyTriplet(T1 firstValue,T2 secondValue, T3 thirdValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTriplet<?, ?, ?> myTriplet = (MyTriplet<?, ?, ?>) o;
        return Objects.equals(firstValue, myTriplet.firstValue) && Objects.equals(secondValue, myTriplet.secondValue) && Objects.equals(thirdValue, myTriplet.thirdValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue, thirdValue);
    }

    @Override
    public String toString() {
        return "MyTriplet{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                ", thirdValue=" + thirdValue +
                '}';
    }
}