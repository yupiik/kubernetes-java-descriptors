package io.yupiik.kubernetes.bindings.v1_20_7.v1;

import java.util.Objects;

public class PodSpecInitContainersEnvValueFrom {
    private PodSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodSpecInitContainersEnvValueFromFieldRef fieldRef;
    private PodSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public PodSpecInitContainersEnvValueFrom(final PodSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                             final PodSpecInitContainersEnvValueFromFieldRef fieldRef,
                                             final PodSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                             final PodSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final PodSpecInitContainersEnvValueFrom __otherCasted = (PodSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
