package io.yupiik.kubernetes.bindings.v1_15_2;

import java.util.Objects;

public class PodListItemsSpecContainersEnvFrom {
    private PodListItemsSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodListItemsSpecContainersEnvFromSecretRef secretRef;

    public PodListItemsSpecContainersEnvFrom() {
        // no-op
    }

    public PodListItemsSpecContainersEnvFrom(final PodListItemsSpecContainersEnvFromConfigMapRef configMapRef,
                                             final String prefix,
                                             final PodListItemsSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodListItemsSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodListItemsSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodListItemsSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodListItemsSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodListItemsSpecContainersEnvFrom)) {
            return false;
        }
        final PodListItemsSpecContainersEnvFrom __otherCasted = (PodListItemsSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
