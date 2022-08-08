package io.yupiik.kubernetes.bindings.v1_17_6.v1beta2;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders {
    private String name;
    private String value;

    public DaemonSetSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders(final String name,
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders __otherCasted = (DaemonSetSpecTemplateSpecContainersLivenessProbeHttpGetHttpHeaders) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }
}
