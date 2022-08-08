package io.yupiik.kubernetes.bindings.v1_20_0;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
