package net.kaoriya.qb.json_schema_dom.draft_v4;

import java.util.Set;

// validator of boolean (primitive type)
public interface BooleanValidation extends InstanceValidation
{
    // 5.5.1 "enum"
    Set<Boolean> getEnum();
}
