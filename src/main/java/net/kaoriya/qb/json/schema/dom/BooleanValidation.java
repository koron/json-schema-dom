package net.kaoriya.qb.json.schema.dom;

import java.util.Set;

// validator of boolean (primitive type)
public interface BooleanValidation extends InstanceValidation
{
    // 5.5.1 "enum"
    Set<Boolean> getEnum();
}
