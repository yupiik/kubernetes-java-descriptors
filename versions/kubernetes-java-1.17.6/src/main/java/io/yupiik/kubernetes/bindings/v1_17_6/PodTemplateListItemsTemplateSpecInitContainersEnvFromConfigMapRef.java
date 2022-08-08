package io.yupiik.kubernetes.bindings.v1_17_6;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersEnvFromConfigMapRef {
    private String name;
    private Boolean optional;

    public PodTemplateListItemsTemplateSpecInitContainersEnvFromConfigMapRef() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnvFromConfigMapRef(final String name,
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersEnvFromConfigMapRef)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersEnvFromConfigMapRef __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersEnvFromConfigMapRef) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
