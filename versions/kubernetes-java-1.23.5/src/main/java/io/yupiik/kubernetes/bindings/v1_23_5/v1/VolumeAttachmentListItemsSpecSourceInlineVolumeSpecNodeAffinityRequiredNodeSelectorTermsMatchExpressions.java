package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.List;
import java.util.Objects;

public class VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions {
    private String key;
    private VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressionsOperator operator;
    private List<String> values;

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions() {
        // no-op
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions(final String key,
                                                                                                                    final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressionsOperator operator,
                                                                                                                    final List<String> values) {
        // no-op
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressionsOperator getOperator() {
        return operator;
    }

    public void setOperator(final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressionsOperator operator) {
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
        if (!(__other instanceof VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions)) {
            return false;
        }
        final VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions __otherCasted = (VolumeAttachmentListItemsSpecSourceInlineVolumeSpecNodeAffinityRequiredNodeSelectorTermsMatchExpressions) __other;
        return Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(values, __otherCasted.values);
    }
}
