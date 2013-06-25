package net.kaoriya.qb.json.schema.dom;

import java.util.regex.Pattern;

// 5.2
public interface StringValidation extends InstanceValidation
{
    // 5.2.1
    Integer getMaxLength();

    // 5.2.2
    Integer getMinLength();

    // 5.2.3
    Pattern getPattern();

    // 7. "format"
    String getFormat();
}
