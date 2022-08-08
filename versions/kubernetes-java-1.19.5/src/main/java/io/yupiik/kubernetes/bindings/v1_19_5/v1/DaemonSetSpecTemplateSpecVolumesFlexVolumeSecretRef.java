package io.yupiik.kubernetes.bindings.v1_19_5.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public DaemonSetSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (DaemonSetSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
