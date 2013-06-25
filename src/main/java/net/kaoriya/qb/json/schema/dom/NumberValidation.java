package net.kaoriya.qb.json.schema.dom;

import java.util.Set;

// validator of number (primitive type)
public interface NumberValidation extends NumericValidation
{
    // 5.5.1 "enum"
    Set<Double> getEnum();
}
