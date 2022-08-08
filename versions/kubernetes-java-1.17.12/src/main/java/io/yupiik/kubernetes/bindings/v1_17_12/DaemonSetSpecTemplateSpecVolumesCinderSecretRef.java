package io.yupiik.kubernetes.bindings.v1_17_12;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public DaemonSetSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (DaemonSetSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
