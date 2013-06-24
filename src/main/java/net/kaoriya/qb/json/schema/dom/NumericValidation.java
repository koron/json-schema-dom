package net.kaoriya.qb.json.schema.dom;

// 5.1
public interface NumericValidation extends InstanceValidation
{
    // 5.1.1
    Number getMultipleOf();

    // 5.1.2
    Maximum getMaximum();

    // 5.1.3
    Minimum getMinimum();
}
