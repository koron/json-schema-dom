package net.kaoriya.qb.json_schema_dom.draft_v4;

import java.util.Set;

// validator of integer (primitive type)
public interface IntegerValidation extends NumericValidation
{
    // 5.5.1 "enum"
    Set<Integer> getEnum();
}
