package io.yupiik.kubernetes.bindings.v1_15_4.v1beta1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef {
    private String name;

    public StatefulSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesCsiNodePublishSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
