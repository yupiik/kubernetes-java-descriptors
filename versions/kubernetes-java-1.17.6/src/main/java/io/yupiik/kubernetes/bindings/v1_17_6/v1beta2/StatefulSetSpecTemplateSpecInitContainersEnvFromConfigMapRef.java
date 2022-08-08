package io.yupiik.kubernetes.bindings.v1_17_6.v1beta2;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersEnvFromConfigMapRef {
    private String name;
    private Boolean optional;

    public StatefulSetSpecTemplateSpecInitContainersEnvFromConfigMapRef() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersEnvFromConfigMapRef(final String name,
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersEnvFromConfigMapRef)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersEnvFromConfigMapRef __otherCasted = (StatefulSetSpecTemplateSpecInitContainersEnvFromConfigMapRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
