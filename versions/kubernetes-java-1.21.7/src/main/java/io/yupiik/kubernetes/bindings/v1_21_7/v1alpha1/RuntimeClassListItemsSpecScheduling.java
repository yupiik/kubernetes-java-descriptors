package io.yupiik.kubernetes.bindings.v1_21_7.v1alpha1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RuntimeClassListItemsSpecScheduling {
    private Map<String, String> nodeSelector;
    private List<RuntimeClassListItemsSpecSchedulingTolerations> tolerations;

    public RuntimeClassListItemsSpecScheduling() {
        // no-op
    }

    public RuntimeClassListItemsSpecScheduling(final Map<String, String> nodeSelector,
                                               final List<RuntimeClassListItemsSpecSchedulingTolerations> tolerations) {
        // no-op
    }

    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public List<RuntimeClassListItemsSpecSchedulingTolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<RuntimeClassListItemsSpecSchedulingTolerations> tolerations) {
        this.tolerations = tolerations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nodeSelector,
                tolerations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RuntimeClassListItemsSpecScheduling)) {
            return false;
        }
        final RuntimeClassListItemsSpecScheduling __otherCasted = (RuntimeClassListItemsSpecScheduling) __other;
        return Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(tolerations, __otherCasted.tolerations);
    }
}
