package net.kaoriya.qb.json.schema.dom;

// 5.3
public interface ArrayValidation
{
    // TODO: 5.3.1 "additionalItems" and "items"

    // 5.3.2
    Integer getMaxItems();

    // 5.3.3
    int getMinItems();

    // 5.3.4
    boolean isUniqueItems();
}
