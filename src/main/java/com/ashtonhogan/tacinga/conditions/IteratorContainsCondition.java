package com.ashtonhogan.tacinga.conditions;

import com.ashtonhogan.tacinga.Condition;
import com.ashtonhogan.tacinga.text.FailureText;
import com.ashtonhogan.tacinga.unit.IterableUnit;
import org.cactoos.list.ListOf;

@SuppressWarnings({"FinalClass", "ClassWithoutLogger"})
public final class IteratorContainsCondition<T> implements Condition {

    private final IterableUnit<T> iterableUnit;

    public IteratorContainsCondition(final IterableUnit<T> iterableUnit) {
        this.iterableUnit = iterableUnit;
    }

    @Override
    public FailureText failureText() throws Exception {
        return this.iterableUnit.failureText();
    }

    @Override
    public Boolean conforms() throws Exception {
        if ((this.iterableUnit.actual() == null) || (this.iterableUnit.expected() == null)) {
            return Boolean.FALSE;
        }
        return new ListOf<>(this.iterableUnit.actual()).containsAll(
                new ListOf<>(this.iterableUnit.expected())
        );
    }

}
