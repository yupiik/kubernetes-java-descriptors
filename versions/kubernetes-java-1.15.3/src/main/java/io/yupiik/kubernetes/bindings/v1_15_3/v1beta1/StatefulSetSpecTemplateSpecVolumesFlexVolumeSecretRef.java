package io.yupiik.kubernetes.bindings.v1_15_3.v1beta1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesFlexVolumeSecretRef {
    private String name;

    public StatefulSetSpecTemplateSpecVolumesFlexVolumeSecretRef() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesFlexVolumeSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesFlexVolumeSecretRef)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesFlexVolumeSecretRef __otherCasted = (StatefulSetSpecTemplateSpecVolumesFlexVolumeSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
