package io.yupiik.kubernetes.bindings.v1_21_2;

import java.util.Objects;

public class PodSpecEphemeralContainersEnvValueFrom {
    private PodSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private PodSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public PodSpecEphemeralContainersEnvValueFrom(final PodSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                  final PodSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                  final PodSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                  final PodSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final PodSpecEphemeralContainersEnvValueFrom __otherCasted = (PodSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
