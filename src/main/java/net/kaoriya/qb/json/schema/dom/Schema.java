package net.kaoriya.qb.json.schema.dom;

import java.util.List;

public interface Schema
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
    List<Schema> getAllOf();

    // 5.5.4 "anyOf"
    List<Schema> getAnyOf();

    // 5.5.5 "oneOf"
    List<Schema> getOneOf();

    // 5.5.6 "not"
    Schema getNot();
}
