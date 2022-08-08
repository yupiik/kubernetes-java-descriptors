package io.yupiik.kubernetes.bindings.v1_17_16.v1beta1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnv(final String name,
                                                                 final String value,
                                                                 final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersEnv __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
