package io.yupiik.kubernetes.bindings.v1_16_2.v1;

import java.util.Objects;

public class PodListItemsSpecInitContainersEnvValueFrom {
    private PodListItemsSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodListItemsSpecInitContainersEnvValueFromFieldRef fieldRef;
    private PodListItemsSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodListItemsSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodListItemsSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public PodListItemsSpecInitContainersEnvValueFrom(final PodListItemsSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                      final PodListItemsSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                      final PodListItemsSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                      final PodListItemsSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodListItemsSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodListItemsSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodListItemsSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodListItemsSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodListItemsSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodListItemsSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodListItemsSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodListItemsSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodListItemsSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final PodListItemsSpecInitContainersEnvValueFrom __otherCasted = (PodListItemsSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
