package io.yupiik.kubernetes.bindings.v1_17_9;

import java.util.Objects;

public class PodSpecContainersEnvValueFrom {
    private PodSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodSpecContainersEnvValueFromFieldRef fieldRef;
    private PodSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodSpecContainersEnvValueFrom() {
        // no-op
    }

    public PodSpecContainersEnvValueFrom(final PodSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                         final PodSpecContainersEnvValueFromFieldRef fieldRef,
                                         final PodSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                         final PodSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodSpecContainersEnvValueFrom)) {
            return false;
        }
        final PodSpecContainersEnvValueFrom __otherCasted = (PodSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
