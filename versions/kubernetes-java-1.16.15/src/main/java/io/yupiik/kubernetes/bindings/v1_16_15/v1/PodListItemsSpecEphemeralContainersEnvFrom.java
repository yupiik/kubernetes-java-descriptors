package io.yupiik.kubernetes.bindings.v1_16_15.v1;

import java.util.Objects;

public class PodListItemsSpecEphemeralContainersEnvFrom {
    private PodListItemsSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodListItemsSpecEphemeralContainersEnvFromSecretRef secretRef;

    public PodListItemsSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersEnvFrom(final PodListItemsSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                      final String prefix,
                                                      final PodListItemsSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodListItemsSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodListItemsSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodListItemsSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersEnvFrom __otherCasted = (PodListItemsSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
