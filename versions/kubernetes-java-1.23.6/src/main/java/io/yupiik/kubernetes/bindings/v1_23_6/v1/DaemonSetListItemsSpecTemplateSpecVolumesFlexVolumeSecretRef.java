package io.yupiik.kubernetes.bindings.v1_23_6.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public DaemonSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
