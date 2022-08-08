package io.yupiik.kubernetes.bindings.v1_21_9.v1;

import java.util.Objects;

public class EphemeralContainersEphemeralContainersEnvFrom {
    private EphemeralContainersEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private EphemeralContainersEphemeralContainersEnvFromSecretRef secretRef;

    public EphemeralContainersEphemeralContainersEnvFrom() {
        // no-op
    }

    public EphemeralContainersEphemeralContainersEnvFrom(final EphemeralContainersEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                         final String prefix,
                                                         final EphemeralContainersEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public EphemeralContainersEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final EphemeralContainersEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public EphemeralContainersEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final EphemeralContainersEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof EphemeralContainersEphemeralContainersEnvFrom)) {
            return false;
        }
        final EphemeralContainersEphemeralContainersEnvFrom __otherCasted = (EphemeralContainersEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
