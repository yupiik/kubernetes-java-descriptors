package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecOs {
    private String name;

    public StatefulSetSpecTemplateSpecOs() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecOs)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecOs __otherCasted = (StatefulSetSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
