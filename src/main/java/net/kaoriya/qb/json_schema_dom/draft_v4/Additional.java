package net.kaoriya.qb.json_schema_dom.draft_v4;

// 5.3.1 and 5.4.4
public interface Additional {

    public interface False extends Additional {
    }

    public interface True extends Additional {
    }

    public interface JSONSchema extends Additional {
        JSONSchema getSchema();
    }

}
