package net.kaoriya.qb.json_schema_dom.draft_v4;

import java.util.Set;
import java.util.regex.Pattern;

// validator of string (primitive type)
// 5.2
public interface StringValidation extends InstanceValidation
{
    // 5.2.1
    Integer getMaxLength();

    // 5.2.2
    Integer getMinLength();

    // 5.2.3
    Pattern getPattern();

    // 5.5.1 "enum"
    Set<String> getEnum();

    // 7. "format"
    String getFormat();

}
