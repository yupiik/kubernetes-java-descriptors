package io.yupiik.kubernetes.bindings.v1_23_8;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecOs {
    private String name;

    public DaemonSetSpecTemplateSpecOs() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecOs)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecOs __otherCasted = (DaemonSetSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
