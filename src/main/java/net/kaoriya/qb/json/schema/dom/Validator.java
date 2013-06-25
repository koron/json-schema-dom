package net.kaoriya.qb.json.schema.dom;

import org.json.JSONObject;

public interface Validator {
    boolean isValid(JSONObject object, Schema schema);
}
