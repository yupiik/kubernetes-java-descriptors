package io.yupiik.kubernetes.bindings.v1_18_15;

import java.util.Objects;

public class PodListItemsSpecContainersEnvValueFrom {
    private PodListItemsSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodListItemsSpecContainersEnvValueFromFieldRef fieldRef;
    private PodListItemsSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodListItemsSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodListItemsSpecContainersEnvValueFrom() {
        // no-op
    }

    public PodListItemsSpecContainersEnvValueFrom(final PodListItemsSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                  final PodListItemsSpecContainersEnvValueFromFieldRef fieldRef,
                                                  final PodListItemsSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                  final PodListItemsSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodListItemsSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodListItemsSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodListItemsSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodListItemsSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodListItemsSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodListItemsSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodListItemsSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodListItemsSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodListItemsSpecContainersEnvValueFrom)) {
            return false;
        }
        final PodListItemsSpecContainersEnvValueFrom __otherCasted = (PodListItemsSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
