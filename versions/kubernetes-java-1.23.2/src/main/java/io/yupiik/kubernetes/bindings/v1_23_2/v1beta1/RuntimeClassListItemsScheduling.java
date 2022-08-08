package io.yupiik.kubernetes.bindings.v1_23_2.v1beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RuntimeClassListItemsScheduling {
    private Map<String, String> nodeSelector;
    private List<RuntimeClassListItemsSchedulingTolerations> tolerations;

    public RuntimeClassListItemsScheduling() {
        // no-op
    }

    public RuntimeClassListItemsScheduling(final Map<String, String> nodeSelector,
                                           final List<RuntimeClassListItemsSchedulingTolerations> tolerations) {
        // no-op
    }

    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public List<RuntimeClassListItemsSchedulingTolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<RuntimeClassListItemsSchedulingTolerations> tolerations) {
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
        if (!(__other instanceof RuntimeClassListItemsScheduling)) {
            return false;
        }
        final RuntimeClassListItemsScheduling __otherCasted = (RuntimeClassListItemsScheduling) __other;
        return Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(tolerations, __otherCasted.tolerations);
    }
}
