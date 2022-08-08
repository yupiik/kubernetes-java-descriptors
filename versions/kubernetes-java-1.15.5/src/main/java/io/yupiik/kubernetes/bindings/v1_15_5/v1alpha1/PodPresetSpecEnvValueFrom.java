package io.yupiik.kubernetes.bindings.v1_15_5.v1alpha1;

import java.util.Objects;

public class PodPresetSpecEnvValueFrom {
    private PodPresetSpecEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodPresetSpecEnvValueFromFieldRef fieldRef;
    private PodPresetSpecEnvValueFromResourceFieldRef resourceFieldRef;
    private PodPresetSpecEnvValueFromSecretKeyRef secretKeyRef;

    public PodPresetSpecEnvValueFrom() {
        // no-op
    }

    public PodPresetSpecEnvValueFrom(final PodPresetSpecEnvValueFromConfigMapKeyRef configMapKeyRef,
                                     final PodPresetSpecEnvValueFromFieldRef fieldRef,
                                     final PodPresetSpecEnvValueFromResourceFieldRef resourceFieldRef,
                                     final PodPresetSpecEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodPresetSpecEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodPresetSpecEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodPresetSpecEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodPresetSpecEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodPresetSpecEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodPresetSpecEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodPresetSpecEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodPresetSpecEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodPresetSpecEnvValueFrom)) {
            return false;
        }
        final PodPresetSpecEnvValueFrom __otherCasted = (PodPresetSpecEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
