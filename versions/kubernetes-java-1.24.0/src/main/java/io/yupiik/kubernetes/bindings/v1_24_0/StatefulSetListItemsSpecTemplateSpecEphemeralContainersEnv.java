package io.yupiik.kubernetes.bindings.v1_24_0;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnv(final String name,
                                                                      final String value,
                                                                      final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnv __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
