package io.yupiik.kubernetes.bindings.v1_24_0.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecOs {
    private String name;

    public StatefulSetListItemsSpecTemplateSpecOs() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecOs(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecOs)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecOs __otherCasted = (StatefulSetListItemsSpecTemplateSpecOs) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
