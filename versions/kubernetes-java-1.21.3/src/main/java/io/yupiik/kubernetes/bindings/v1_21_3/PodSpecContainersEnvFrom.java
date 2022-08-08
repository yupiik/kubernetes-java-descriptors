package io.yupiik.kubernetes.bindings.v1_21_3;

import java.util.Objects;

public class PodSpecContainersEnvFrom {
    private PodSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodSpecContainersEnvFromSecretRef secretRef;

    public PodSpecContainersEnvFrom() {
        // no-op
    }

    public PodSpecContainersEnvFrom(final PodSpecContainersEnvFromConfigMapRef configMapRef,
                                    final String prefix,
                                    final PodSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodSpecContainersEnvFrom)) {
            return false;
        }
        final PodSpecContainersEnvFrom __otherCasted = (PodSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
