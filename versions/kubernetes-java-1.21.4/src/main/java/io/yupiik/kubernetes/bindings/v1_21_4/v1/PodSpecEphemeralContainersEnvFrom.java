package io.yupiik.kubernetes.bindings.v1_21_4.v1;

import java.util.Objects;

public class PodSpecEphemeralContainersEnvFrom {
    private PodSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodSpecEphemeralContainersEnvFromSecretRef secretRef;

    public PodSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public PodSpecEphemeralContainersEnvFrom(final PodSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                             final String prefix,
                                             final PodSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final PodSpecEphemeralContainersEnvFrom __otherCasted = (PodSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
