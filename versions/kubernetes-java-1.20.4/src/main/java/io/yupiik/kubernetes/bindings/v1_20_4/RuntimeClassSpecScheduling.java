package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RuntimeClassSpecScheduling {
    private Map<String, String> nodeSelector;
    private List<RuntimeClassSpecSchedulingTolerations> tolerations;

    public RuntimeClassSpecScheduling() {
        // no-op
    }

    public RuntimeClassSpecScheduling(final Map<String, String> nodeSelector,
                                      final List<RuntimeClassSpecSchedulingTolerations> tolerations) {
        // no-op
    }

    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public List<RuntimeClassSpecSchedulingTolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<RuntimeClassSpecSchedulingTolerations> tolerations) {
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
        if (!(__other instanceof RuntimeClassSpecScheduling)) {
            return false;
        }
        final RuntimeClassSpecScheduling __otherCasted = (RuntimeClassSpecScheduling) __other;
        return Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(tolerations, __otherCasted.tolerations);
    }
}
