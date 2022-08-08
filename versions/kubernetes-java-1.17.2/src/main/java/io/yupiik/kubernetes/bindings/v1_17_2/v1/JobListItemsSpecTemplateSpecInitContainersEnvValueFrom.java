package io.yupiik.kubernetes.bindings.v1_17_2.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersEnvValueFrom {
    private JobListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private JobListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private JobListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private JobListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public JobListItemsSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersEnvValueFrom(final JobListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                  final JobListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                  final JobListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                  final JobListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final JobListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public JobListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final JobListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public JobListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final JobListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public JobListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final JobListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMapKeyRef,
                fieldRef,
                resourceFieldRef,
                secretKeyRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (JobListItemsSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
