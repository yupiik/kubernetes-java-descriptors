package io.yupiik.kubernetes.bindings.v1_20_8;

import java.util.Objects;

public class JobSpecTemplateSpecContainersEnvValueFrom {
    private JobSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private JobSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private JobSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private JobSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public JobSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public JobSpecTemplateSpecContainersEnvValueFrom(final JobSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                     final JobSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                     final JobSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                     final JobSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public JobSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final JobSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public JobSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final JobSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public JobSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final JobSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public JobSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final JobSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final JobSpecTemplateSpecContainersEnvValueFrom __otherCasted = (JobSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
