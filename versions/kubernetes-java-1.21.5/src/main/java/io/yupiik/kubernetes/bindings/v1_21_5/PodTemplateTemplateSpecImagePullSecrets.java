package io.yupiik.kubernetes.bindings.v1_21_5;

import java.util.Objects;

public class PodTemplateTemplateSpecImagePullSecrets {
    private String name;

    public PodTemplateTemplateSpecImagePullSecrets() {
        // no-op
    }

    public PodTemplateTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof PodTemplateTemplateSpecImagePullSecrets)) {
            return false;
        }
        final PodTemplateTemplateSpecImagePullSecrets __otherCasted = (PodTemplateTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
