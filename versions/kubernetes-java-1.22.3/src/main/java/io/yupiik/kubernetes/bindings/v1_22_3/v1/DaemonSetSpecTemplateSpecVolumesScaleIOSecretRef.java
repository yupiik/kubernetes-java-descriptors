package io.yupiik.kubernetes.bindings.v1_22_3.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public DaemonSetSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (DaemonSetSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
