package io.yupiik.kubernetes.bindings.v1_19_2.v1;

import java.util.Objects;

public class PodListItemsSpecEphemeralContainersEnvValueFrom {
    private PodListItemsSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodListItemsSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private PodListItemsSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodListItemsSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodListItemsSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersEnvValueFrom(final PodListItemsSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                           final PodListItemsSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                           final PodListItemsSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                           final PodListItemsSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodListItemsSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodListItemsSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodListItemsSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodListItemsSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodListItemsSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodListItemsSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodListItemsSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersEnvValueFrom __otherCasted = (PodListItemsSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
