package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFields {
    private String key;
    private PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFieldsOperator operator;
    private List<String> values;

    public PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFields() {
        // no-op
    }

    public PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFields(final String key,
                                                                                         final PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFieldsOperator operator,
                                                                                         final List<String> values) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFieldsOperator getOperator() {
        return operator;
    }

    public void setOperator(final PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFieldsOperator operator) {
        this.operator = operator;
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
                operator,
                values);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFields)) {
            return false;
        }
        final PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFields __otherCasted = (PersistentVolumeListItemsSpecNodeAffinityRequiredNodeSelectorTermsMatchFields) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(values, __otherCasted.values);
    }
}
