package io.yupiik.kubernetes.bindings.v1_17_1.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public PodTemplateTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesIscsiSecretRef __otherCasted = (PodTemplateTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
