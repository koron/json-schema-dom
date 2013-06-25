package net.kaoriya.qb.json.schema.dom;

import java.util.List;

import org.json.JSONArray;

// validator of array (primitive type)
// 5.3
public interface ArrayValidation
{
    // 5.3.1 "additionalItems"
    Additional getAdditionalItems();

    // 5.3.1 "items"
    List<Schema> getItems();

    // 5.3.2
    Integer getMaxItems();

    // 5.3.3
    int getMinItems();

    // 5.3.4
    boolean isUniqueItems();

    // 5.5.1 "enum"
    List<JSONArray> getEnum();
}
