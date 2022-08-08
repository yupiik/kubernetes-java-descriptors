package io.yupiik.kubernetes.bindings.v1_18_7;

import java.util.Objects;

public class JobSpecTemplateSpecInitContainersEnvValueFrom {
    private JobSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private JobSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private JobSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private JobSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public JobSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersEnvValueFrom(final JobSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                         final JobSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                         final JobSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                         final JobSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final JobSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public JobSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final JobSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public JobSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final JobSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public JobSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final JobSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (JobSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
