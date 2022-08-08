package io.yupiik.kubernetes.bindings.v1_14_10;

import java.util.Objects;

public class PodListItemsSpecInitContainersEnvFrom {
    private PodListItemsSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodListItemsSpecInitContainersEnvFromSecretRef secretRef;

    public PodListItemsSpecInitContainersEnvFrom() {
        // no-op
    }

    public PodListItemsSpecInitContainersEnvFrom(final PodListItemsSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                 final String prefix,
                                                 final PodListItemsSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodListItemsSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodListItemsSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodListItemsSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodListItemsSpecInitContainersEnvFromSecretRef secretRef) {
        this.secretRef = secretRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMapRef,
                prefix,
                secretRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecInitContainersEnvFrom)) {
            return false;
        }
        final PodListItemsSpecInitContainersEnvFrom __otherCasted = (PodListItemsSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
