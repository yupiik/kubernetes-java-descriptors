package io.yupiik.kubernetes.bindings.v1_17_6.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public StatefulSetSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (StatefulSetSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
