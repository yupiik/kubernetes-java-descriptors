package io.yupiik.kubernetes.bindings.v1_16_0.v1beta1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RuntimeClassScheduling {
    private Map<String, String> nodeSelector;
    private List<RuntimeClassSchedulingTolerations> tolerations;

    public RuntimeClassScheduling() {
        // no-op
    }

    public RuntimeClassScheduling(final Map<String, String> nodeSelector,
                                  final List<RuntimeClassSchedulingTolerations> tolerations) {
        // no-op
    }

    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(final Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public List<RuntimeClassSchedulingTolerations> getTolerations() {
        return tolerations;
    }

    public void setTolerations(final List<RuntimeClassSchedulingTolerations> tolerations) {
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
        if (!(__other instanceof RuntimeClassScheduling)) {
            return false;
        }
        final RuntimeClassScheduling __otherCasted = (RuntimeClassScheduling) __other;
        return Objects.equals(nodeSelector, __otherCasted.nodeSelector) &&
            Objects.equals(tolerations, __otherCasted.tolerations);
    }
}
