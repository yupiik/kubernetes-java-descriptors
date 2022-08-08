package io.yupiik.kubernetes.bindings.v1_16_4;

import java.util.List;
import java.util.Objects;

public class StorageClassListItemsAllowedTopologiesMatchLabelExpressions {
    private String key;
    private List<String> values;

    public StorageClassListItemsAllowedTopologiesMatchLabelExpressions() {
        // no-op
    }

    public StorageClassListItemsAllowedTopologiesMatchLabelExpressions(final String key,
                                                                       final List<String> values) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(final List<String> values) {
        this.values = values;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                values);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageClassListItemsAllowedTopologiesMatchLabelExpressions)) {
            return false;
        }
        final StorageClassListItemsAllowedTopologiesMatchLabelExpressions __otherCasted = (StorageClassListItemsAllowedTopologiesMatchLabelExpressions) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(values, __otherCasted.values);
    }
}
