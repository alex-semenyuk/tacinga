package com.ashtonhogan.tacinga.unit;

public interface IterableUnit<T> extends Unit {

    public Iterable<T> expected() throws Exception;

    public Iterable<T> actual() throws Exception;
}
