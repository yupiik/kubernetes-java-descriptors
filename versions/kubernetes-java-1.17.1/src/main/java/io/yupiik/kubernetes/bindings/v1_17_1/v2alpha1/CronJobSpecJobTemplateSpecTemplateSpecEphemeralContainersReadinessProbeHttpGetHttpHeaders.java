package io.yupiik.kubernetes.bindings.v1_17_1.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders {
    private String name;
    private String value;

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders(final String name,
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersReadinessProbeHttpGetHttpHeaders) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value);
    }
}
