package io.yupiik.kubernetes.bindings.v1_20_2.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecImagePullSecrets {
    private String name;

    public DaemonSetListItemsSpecTemplateSpecImagePullSecrets() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecImagePullSecrets(final String name) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecImagePullSecrets)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecImagePullSecrets __otherCasted = (DaemonSetListItemsSpecTemplateSpecImagePullSecrets) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
