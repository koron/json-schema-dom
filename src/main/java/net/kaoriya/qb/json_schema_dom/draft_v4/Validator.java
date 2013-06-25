package net.kaoriya.qb.json_schema_dom.draft_v4;

import org.json.JSONObject;

public interface Validator {
    boolean isValid(JSONObject object, Schema schema);
}
