package io.yupiik.kubernetes.bindings.v1_16_13.v1beta2;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public DaemonSetSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (DaemonSetSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
