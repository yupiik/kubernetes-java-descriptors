package io.yupiik.kubernetes.bindings.v1_21_4.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersEnv {
    private String name;
    private String value;
    private PodTemplateListItemsTemplateSpecContainersEnvValueFrom valueFrom;

    public PodTemplateListItemsTemplateSpecContainersEnv() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersEnv(final String name,
                                                         final String value,
                                                         final PodTemplateListItemsTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public PodTemplateListItemsTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodTemplateListItemsTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersEnv)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersEnv __otherCasted = (PodTemplateListItemsTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
