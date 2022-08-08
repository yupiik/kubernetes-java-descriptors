package io.yupiik.kubernetes.bindings.v1_18_19.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public StatefulSetSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (StatefulSetSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
