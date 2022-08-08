package io.yupiik.kubernetes.bindings.v1_14_6;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnv(final String name,
                                                                            final String value,
                                                                            final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnv __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
