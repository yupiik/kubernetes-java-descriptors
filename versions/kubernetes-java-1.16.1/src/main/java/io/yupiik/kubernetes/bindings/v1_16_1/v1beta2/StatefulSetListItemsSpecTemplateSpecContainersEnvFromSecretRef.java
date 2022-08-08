package io.yupiik.kubernetes.bindings.v1_16_1.v1beta2;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersEnvFromSecretRef {
    private String name;
    private Boolean optional;

    public StatefulSetListItemsSpecTemplateSpecContainersEnvFromSecretRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnvFromSecretRef(final String name,
                                                                          final Boolean optional) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersEnvFromSecretRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersEnvFromSecretRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersEnvFromSecretRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
