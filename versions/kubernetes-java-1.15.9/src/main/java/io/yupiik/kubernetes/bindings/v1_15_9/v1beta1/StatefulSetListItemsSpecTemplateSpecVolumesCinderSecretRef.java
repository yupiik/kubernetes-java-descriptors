package io.yupiik.kubernetes.bindings.v1_15_9.v1beta1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesCinderSecretRef {
    private String name;

    public StatefulSetListItemsSpecTemplateSpecVolumesCinderSecretRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesCinderSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesCinderSecretRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesCinderSecretRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesCinderSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
