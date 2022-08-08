package io.yupiik.kubernetes.bindings.v1_17_1;

import java.util.Objects;

public class PodPresetSpecEnvFrom {
    private PodPresetSpecEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodPresetSpecEnvFromSecretRef secretRef;

    public PodPresetSpecEnvFrom() {
        // no-op
    }

    public PodPresetSpecEnvFrom(final PodPresetSpecEnvFromConfigMapRef configMapRef,
                                final String prefix,
                                final PodPresetSpecEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodPresetSpecEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodPresetSpecEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodPresetSpecEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodPresetSpecEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodPresetSpecEnvFrom)) {
            return false;
        }
        final PodPresetSpecEnvFrom __otherCasted = (PodPresetSpecEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
