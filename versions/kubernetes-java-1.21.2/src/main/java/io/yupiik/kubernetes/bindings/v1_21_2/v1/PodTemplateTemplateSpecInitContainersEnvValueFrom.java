package io.yupiik.kubernetes.bindings.v1_21_2.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersEnvValueFrom {
    private PodTemplateTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodTemplateTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private PodTemplateTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodTemplateTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodTemplateTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersEnvValueFrom(final PodTemplateTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                             final PodTemplateTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                             final PodTemplateTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                             final PodTemplateTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodTemplateTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodTemplateTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodTemplateTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodTemplateTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodTemplateTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodTemplateTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodTemplateTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersEnvValueFrom __otherCasted = (PodTemplateTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
