package io.yupiik.kubernetes.bindings.v1_23_9;

import java.util.Objects;

public class PodTemplateTemplateSpecOs {
    private String name;

    public PodTemplateTemplateSpecOs() {
        // no-op
    }

    public PodTemplateTemplateSpecOs(final String name) {
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
        if (!(__other instanceof PodTemplateTemplateSpecOs)) {
            return false;
        }
        final PodTemplateTemplateSpecOs __otherCasted = (PodTemplateTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
