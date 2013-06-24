package net.kaoriya.qb.json.schema.dom;

import java.util.Set;
import java.util.Map;

// 5.4 "Validation keywords for objects"
public interface ObjectValidation
{
    // 5.4.1 "maxProperties"
    Integer getMaxProperties();

    // 5.4.2 "minProperties"
    int getMinProperties();

    // 5.4.3 "required"
    Set<String> getRequired();

    // FIXME: 5.4.4 "additionalProperties, properties and patternProperties"

    // 5.4.5 "dependencies"
    Map<String, Dependency> getDependencies();
}
