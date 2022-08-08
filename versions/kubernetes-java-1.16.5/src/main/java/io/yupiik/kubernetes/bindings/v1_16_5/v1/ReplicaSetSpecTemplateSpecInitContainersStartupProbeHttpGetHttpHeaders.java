package io.yupiik.kubernetes.bindings.v1_16_5.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders {
    private String name;
    private String value;

    public ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders(final String name,
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersStartupProbeHttpGetHttpHeaders) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }
}
