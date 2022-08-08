package io.yupiik.kubernetes.bindings.v1_24_0.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersEnv {
    private String name;
    private String value;
    private StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom;

    public StatefulSetSpecTemplateSpecEphemeralContainersEnv() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersEnv(final String name,
                                                             final String value,
                                                             final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersEnv)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersEnv __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
