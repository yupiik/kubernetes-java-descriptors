package io.yupiik.kubernetes.bindings.v1_15_3;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public DaemonSetSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (DaemonSetSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
