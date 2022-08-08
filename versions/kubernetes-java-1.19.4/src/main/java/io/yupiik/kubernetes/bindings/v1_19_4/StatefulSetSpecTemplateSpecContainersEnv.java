package io.yupiik.kubernetes.bindings.v1_19_4;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private StatefulSetSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public StatefulSetSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersEnv(final String name,
                                                    final String value,
                                                    final StatefulSetSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public StatefulSetSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final StatefulSetSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersEnv __otherCasted = (StatefulSetSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
