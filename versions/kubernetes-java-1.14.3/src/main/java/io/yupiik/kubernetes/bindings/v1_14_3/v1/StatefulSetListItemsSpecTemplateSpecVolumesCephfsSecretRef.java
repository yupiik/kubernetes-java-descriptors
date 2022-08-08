package io.yupiik.kubernetes.bindings.v1_14_3.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesCephfsSecretRef {
    private String name;

    public StatefulSetListItemsSpecTemplateSpecVolumesCephfsSecretRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesCephfsSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesCephfsSecretRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesCephfsSecretRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesCephfsSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
