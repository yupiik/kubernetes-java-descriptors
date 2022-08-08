package io.yupiik.kubernetes.bindings.v1_18_11;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public StatefulSetListItemsSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
