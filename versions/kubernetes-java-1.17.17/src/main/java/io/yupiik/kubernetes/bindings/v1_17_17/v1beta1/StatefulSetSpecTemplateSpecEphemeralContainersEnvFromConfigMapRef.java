package io.yupiik.kubernetes.bindings.v1_17_17.v1beta1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef {
    private String name;
    private Boolean optional;

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef(final String name,
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
