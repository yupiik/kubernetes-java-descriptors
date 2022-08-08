package io.yupiik.kubernetes.bindings.v1_22_12.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public ReplicationControllerSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
