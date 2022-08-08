package io.yupiik.kubernetes.bindings.v1_10_11.v1;

import io.yupiik.kubernetes.bindings.v1_10_11.Validable;
import io.yupiik.kubernetes.bindings.v1_10_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EnvFromSource implements Validable<EnvFromSource> {
    private ConfigMapEnvSource configMapRef;
    private String prefix;
    private SecretEnvSource secretRef;

    public EnvFromSource() {
        // no-op
    }

    public EnvFromSource(final ConfigMapEnvSource configMapRef,
                         final String prefix,
                         final SecretEnvSource secretRef) {
        // no-op
    }

    public ConfigMapEnvSource getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ConfigMapEnvSource configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public SecretEnvSource getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final SecretEnvSource secretRef) {
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
        if (!(__other instanceof EnvFromSource)) {
            return false;
        }
        final EnvFromSource __otherCasted = (EnvFromSource) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }

    public EnvFromSource configMapRef(final ConfigMapEnvSource configMapRef) {
        this.configMapRef = configMapRef;
        return this;
    }

    public EnvFromSource prefix(final String prefix) {
        this.prefix = prefix;
        return this;
    }

    public EnvFromSource secretRef(final SecretEnvSource secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    @Override
    public EnvFromSource validate() {
        return this;
    }
}
