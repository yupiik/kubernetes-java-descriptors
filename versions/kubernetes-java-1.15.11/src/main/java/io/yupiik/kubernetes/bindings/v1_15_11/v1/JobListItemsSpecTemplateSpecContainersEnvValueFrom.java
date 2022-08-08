package io.yupiik.kubernetes.bindings.v1_15_11.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersEnvValueFrom {
    private JobListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private JobListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private JobListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private JobListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public JobListItemsSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersEnvValueFrom(final JobListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                              final JobListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                              final JobListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                              final JobListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final JobListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public JobListItemsSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final JobListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public JobListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final JobListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public JobListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final JobListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersEnvValueFrom __otherCasted = (JobListItemsSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
