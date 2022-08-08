package io.yupiik.kubernetes.bindings.v1_16_9.v1alpha1;

import java.util.Objects;

public class PodPresetListItemsSpecEnvValueFrom {
    private PodPresetListItemsSpecEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodPresetListItemsSpecEnvValueFromFieldRef fieldRef;
    private PodPresetListItemsSpecEnvValueFromResourceFieldRef resourceFieldRef;
    private PodPresetListItemsSpecEnvValueFromSecretKeyRef secretKeyRef;

    public PodPresetListItemsSpecEnvValueFrom() {
        // no-op
    }

    public PodPresetListItemsSpecEnvValueFrom(final PodPresetListItemsSpecEnvValueFromConfigMapKeyRef configMapKeyRef,
                                              final PodPresetListItemsSpecEnvValueFromFieldRef fieldRef,
                                              final PodPresetListItemsSpecEnvValueFromResourceFieldRef resourceFieldRef,
                                              final PodPresetListItemsSpecEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodPresetListItemsSpecEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodPresetListItemsSpecEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodPresetListItemsSpecEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodPresetListItemsSpecEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodPresetListItemsSpecEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodPresetListItemsSpecEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodPresetListItemsSpecEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodPresetListItemsSpecEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodPresetListItemsSpecEnvValueFrom)) {
            return false;
        }
        final PodPresetListItemsSpecEnvValueFrom __otherCasted = (PodPresetListItemsSpecEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
