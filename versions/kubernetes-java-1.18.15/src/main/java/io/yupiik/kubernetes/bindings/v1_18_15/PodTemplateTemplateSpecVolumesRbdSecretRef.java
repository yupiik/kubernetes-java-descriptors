package io.yupiik.kubernetes.bindings.v1_18_15;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesRbdSecretRef {
    private String name;

    public PodTemplateTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesRbdSecretRef __otherCasted = (PodTemplateTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
