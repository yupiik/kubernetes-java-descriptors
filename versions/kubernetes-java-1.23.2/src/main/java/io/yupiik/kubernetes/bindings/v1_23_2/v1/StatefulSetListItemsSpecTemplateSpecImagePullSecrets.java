package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecImagePullSecrets {
    private String name;

    public StatefulSetListItemsSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecImagePullSecrets __otherCasted = (StatefulSetListItemsSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
