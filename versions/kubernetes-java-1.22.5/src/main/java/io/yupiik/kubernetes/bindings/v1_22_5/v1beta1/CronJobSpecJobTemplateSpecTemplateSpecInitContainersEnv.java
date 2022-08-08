package io.yupiik.kubernetes.bindings.v1_22_5.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnv(final String name,
                                                                   final String value,
                                                                   final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnv __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
