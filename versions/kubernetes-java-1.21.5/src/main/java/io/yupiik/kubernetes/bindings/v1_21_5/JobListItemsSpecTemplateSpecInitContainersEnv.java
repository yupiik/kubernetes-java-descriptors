package io.yupiik.kubernetes.bindings.v1_21_5;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersEnv {
    private String name;
    private String value;
    private JobListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom;

    public JobListItemsSpecTemplateSpecInitContainersEnv() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersEnv(final String name,
                                                         final String value,
                                                         final JobListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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

    public JobListItemsSpecTemplateSpecInitContainersEnvValueFrom getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(final JobListItemsSpecTemplateSpecInitContainersEnvValueFrom valueFrom) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersEnv)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersEnv __otherCasted = (JobListItemsSpecTemplateSpecInitContainersEnv) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(value, __otherCasted.value) &&
            Objects.equals(valueFrom, __otherCasted.valueFrom);
    }
}
