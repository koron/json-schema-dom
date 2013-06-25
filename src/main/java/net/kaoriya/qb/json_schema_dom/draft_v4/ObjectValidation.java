package net.kaoriya.qb.json_schema_dom.draft_v4;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;

// validator of object (primitive type)
// 5.4 "Validation keywords for objects"
public interface ObjectValidation extends InstanceValidation
{
    // 5.4.1 "maxProperties"
    Integer getMaxProperties();

    // 5.4.2 "minProperties"
    int getMinProperties();

    // 5.4.3 "required"
    Set<String> getRequired();

    // 5.4.4 "additionalProperties"
    Additional getAdditionalProperties();

    // 5.4.4 "properties"
    Map<String, JSONSchema> getProperties();

    // 5.4.4 "patternProperties"
    Map<String, JSONSchema> getPatternProperties();

    // 5.4.5 "dependencies"
    Map<String, Dependency> getDependencies();

    // 5.5.1 "enum"
    List<JSONObject> getEnum();
}
