package io.yupiik.kubernetes.bindings.v1_16_11.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnv {
    private String name;
    private String value;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom valueFrom;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnv() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnv(final String name,
                                                                        final String value,
                                                                        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnv)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnv __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
