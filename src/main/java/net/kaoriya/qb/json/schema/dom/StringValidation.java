package net.kaoriya.qb.json.schema.dom;

public interface StringValidation extends InstanceValidation
{
    // 5.2.1
    Integer getMaxLength();

    // 5.2.2
    Integer getMinLength();
}
