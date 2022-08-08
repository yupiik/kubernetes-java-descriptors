package io.yupiik.kubernetes.bindings.v1_17_8;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private StatefulSetSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public StatefulSetSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersEnv(final String name,
                                                        final String value,
                                                        final StatefulSetSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public StatefulSetSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final StatefulSetSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersEnv __otherCasted = (StatefulSetSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
