package io.yupiik.kubernetes.bindings.v1_17_4;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public StatefulSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
