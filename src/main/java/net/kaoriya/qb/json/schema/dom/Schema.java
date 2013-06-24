package net.kaoriya.qb.json.schema.dom;

import java.net.URI;

public interface Schema
{
    String getID();

    URI getSchemaURI();

    String getTitle();

    String getDescription();

    // FIXME:
    Object getDefault();
}
