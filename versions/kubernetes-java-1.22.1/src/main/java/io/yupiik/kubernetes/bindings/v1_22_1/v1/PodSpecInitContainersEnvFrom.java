package io.yupiik.kubernetes.bindings.v1_22_1.v1;

import java.util.Objects;

public class PodSpecInitContainersEnvFrom {
    private PodSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodSpecInitContainersEnvFromSecretRef secretRef;

    public PodSpecInitContainersEnvFrom() {
        // no-op
    }

    public PodSpecInitContainersEnvFrom(final PodSpecInitContainersEnvFromConfigMapRef configMapRef,
                                        final String prefix,
                                        final PodSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodSpecInitContainersEnvFrom)) {
            return false;
        }
        final PodSpecInitContainersEnvFrom __otherCasted = (PodSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
