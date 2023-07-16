package com.sk00sha.generator;

public interface GenericDataGenerator<T1,T2> {
    public T1 generateSpecificObject(T2 objectToGenerate,int randomPosition);

}
