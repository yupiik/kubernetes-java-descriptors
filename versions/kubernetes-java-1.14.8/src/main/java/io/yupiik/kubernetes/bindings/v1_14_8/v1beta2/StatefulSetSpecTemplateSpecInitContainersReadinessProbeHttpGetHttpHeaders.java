package io.yupiik.kubernetes.bindings.v1_14_8.v1beta2;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders {
    private String name;
    private String value;

    public StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders(final String name,
                                                                                     final String value) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders __otherCasted = (StatefulSetSpecTemplateSpecInitContainersReadinessProbeHttpGetHttpHeaders) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }
}
