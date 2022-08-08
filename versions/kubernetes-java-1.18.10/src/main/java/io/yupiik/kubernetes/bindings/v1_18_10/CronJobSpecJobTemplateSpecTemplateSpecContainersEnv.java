package io.yupiik.kubernetes.bindings.v1_18_10;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnv(final String name,
                                                               final String value,
                                                               final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersEnv __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
