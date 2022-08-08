package io.yupiik.kubernetes.bindings.v1_16_0;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef {
    private String name;

    public StatefulSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesScaleIOSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
