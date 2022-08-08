package io.yupiik.kubernetes.bindings.v1_14_6.v1beta2;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateMetadataInitializersPending {
    private String name;

    public StatefulSetListItemsSpecTemplateMetadataInitializersPending() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateMetadataInitializersPending(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateMetadataInitializersPending)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateMetadataInitializersPending __otherCasted = (StatefulSetListItemsSpecTemplateMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
