package io.yupiik.kubernetes.bindings.v1_20_8;

import java.util.Objects;

public class PodTemplateTemplateSpecContainersEnvValueFrom {
    private PodTemplateTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodTemplateTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private PodTemplateTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodTemplateTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodTemplateTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersEnvValueFrom(final PodTemplateTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                         final PodTemplateTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                         final PodTemplateTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                         final PodTemplateTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodTemplateTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodTemplateTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodTemplateTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodTemplateTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodTemplateTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodTemplateTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodTemplateTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodTemplateTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersEnvValueFrom __otherCasted = (PodTemplateTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
