package com.ashtonhogan.tacinga.conditions;

import com.ashtonhogan.tacinga.Condition;
import com.ashtonhogan.tacinga.text.FailureText;
import com.ashtonhogan.tacinga.unit.ObjectUnit;

@SuppressWarnings({"FinalClass", "ClassWithoutLogger"})
public final class NotNullCondition implements Condition {

    private final ObjectUnit objectUnit;

    public NotNullCondition(final ObjectUnit objectUnit) {
        this.objectUnit = objectUnit;
    }

    @Override
    public FailureText failureText() throws Exception {
        return this.objectUnit.failureText();
    }

    @Override
    public Boolean conforms() throws Exception {
        return this.objectUnit.actual() != null;
    }

}
