package io.yupiik.kubernetes.bindings.v1_14_0.v1beta1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private StatefulSetListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public StatefulSetListItemsSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnv(final String name,
                                                             final String value,
                                                             final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public StatefulSetListItemsSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersEnv __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
