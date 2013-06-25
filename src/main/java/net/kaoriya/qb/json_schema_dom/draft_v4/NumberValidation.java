package net.kaoriya.qb.json_schema_dom.draft_v4;

import java.util.Set;

// validator of number (primitive type)
public interface NumberValidation extends NumericValidation
{
    // 5.5.1 "enum"
    Set<Double> getEnum();
}
