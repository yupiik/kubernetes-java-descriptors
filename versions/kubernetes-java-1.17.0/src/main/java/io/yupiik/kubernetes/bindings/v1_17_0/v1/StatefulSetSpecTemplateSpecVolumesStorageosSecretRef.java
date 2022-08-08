package io.yupiik.kubernetes.bindings.v1_17_0.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public StatefulSetSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (StatefulSetSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
