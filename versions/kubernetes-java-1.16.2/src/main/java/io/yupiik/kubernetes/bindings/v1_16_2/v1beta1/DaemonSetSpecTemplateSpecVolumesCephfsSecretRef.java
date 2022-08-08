package io.yupiik.kubernetes.bindings.v1_16_2.v1beta1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public DaemonSetSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (DaemonSetSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
