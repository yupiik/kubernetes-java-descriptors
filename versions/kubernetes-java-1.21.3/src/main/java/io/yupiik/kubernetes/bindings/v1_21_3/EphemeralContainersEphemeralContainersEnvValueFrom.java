package io.yupiik.kubernetes.bindings.v1_21_3;

import java.util.Objects;

public class EphemeralContainersEphemeralContainersEnvValueFrom {
    private EphemeralContainersEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private EphemeralContainersEphemeralContainersEnvValueFromFieldRef fieldRef;
    private EphemeralContainersEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private EphemeralContainersEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public EphemeralContainersEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersEnvValueFrom(final EphemeralContainersEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                              final EphemeralContainersEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                              final EphemeralContainersEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                              final EphemeralContainersEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public EphemeralContainersEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final EphemeralContainersEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public EphemeralContainersEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final EphemeralContainersEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public EphemeralContainersEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final EphemeralContainersEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public EphemeralContainersEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final EphemeralContainersEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersEnvValueFrom __otherCasted = (EphemeralContainersEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
