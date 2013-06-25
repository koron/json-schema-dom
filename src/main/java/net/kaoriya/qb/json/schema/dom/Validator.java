package net.kaoriya.qb.json.schema.dom;

public interface Validator {
    boolean isValid(JSONObject object, Schema schema);
}
