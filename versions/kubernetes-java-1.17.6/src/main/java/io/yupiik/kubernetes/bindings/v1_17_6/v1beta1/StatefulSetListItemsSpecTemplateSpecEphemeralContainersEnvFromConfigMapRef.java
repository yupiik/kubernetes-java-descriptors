package io.yupiik.kubernetes.bindings.v1_17_6.v1beta1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef {
    private String name;
    private Boolean optional;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef(final String name,
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
