package io.yupiik.kubernetes.bindings.v1_18_13;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnv(final String name,
                                                                  final String value,
                                                                  final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersEnv __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
