package io.yupiik.kubernetes.bindings.v1_21_0.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public DaemonSetSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (DaemonSetSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
