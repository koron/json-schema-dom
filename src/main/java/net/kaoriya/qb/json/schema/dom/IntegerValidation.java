package net.kaoriya.qb.json.schema.dom;

import java.util.Set;

// validator of integer (primitive type)
public interface IntegerValidation extends NumericValidation
{
    // 5.5.1 "enum"
    Set<Integer> getEnum();
}
