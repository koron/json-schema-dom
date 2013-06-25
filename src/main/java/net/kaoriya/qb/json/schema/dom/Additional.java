package net.kaoriya.qb.json.schema.dom;

// 5.3.1 and 5.4.4
public interface Additional {

    public interface False extends Additional {
    }

    public interface True extends Additional {
    }

    public interface Schema extends Additional {
        Schema getSchema();
    }

}
