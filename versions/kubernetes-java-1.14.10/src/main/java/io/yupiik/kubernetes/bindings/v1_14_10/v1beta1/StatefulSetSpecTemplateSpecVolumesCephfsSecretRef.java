package io.yupiik.kubernetes.bindings.v1_14_10.v1beta1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public StatefulSetSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (StatefulSetSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
