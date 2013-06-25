package net.kaoriya.qb.json_schema_dom.draft_v4;

import java.util.List;

public interface JSONSchema
{
    // 5.5.2 "type"
    //
    // Valid values:
    //  - NullValidation
    //  - BooleanValidation
    //  - IntegerValidation
    //  - NumberValidation
    //  - StringValidation
    //  - ArrayValidation
    //  - ObjectValidation
    List<InstanceValidation> getType();

    // 5.5.3 "allOf"
    List<JSONSchema> getAllOf();

    // 5.5.4 "anyOf"
    List<JSONSchema> getAnyOf();

    // 5.5.5 "oneOf"
    List<JSONSchema> getOneOf();

    // 5.5.6 "not"
    JSONSchema getNot();
}
