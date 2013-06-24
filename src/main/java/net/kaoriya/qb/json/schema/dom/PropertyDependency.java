package net.kaoriya.qb.json.schema.dom;

import java.util.Set;

// 5.4.5.2.2
public interface PropertyDependency extends Dependency
{
    Set<String> getNames();
}
