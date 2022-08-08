package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private PodTemplateListItemsTemplateSpecInitContainersEnvValueFrom valueFrom;

    public PodTemplateListItemsTemplateSpecInitContainersEnv() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnv(final String name,
                                                             final String value,
                                                             final PodTemplateListItemsTemplateSpecInitContainersEnvValueFrom valueFrom) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodTemplateListItemsTemplateSpecInitContainersEnvValueFrom valueFrom) {
        this.valueFrom = valueFrom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value,
                valueFrom);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersEnv)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersEnv __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
