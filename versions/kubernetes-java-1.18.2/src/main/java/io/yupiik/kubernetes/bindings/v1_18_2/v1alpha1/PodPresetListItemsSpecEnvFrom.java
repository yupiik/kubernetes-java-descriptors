package io.yupiik.kubernetes.bindings.v1_18_2.v1alpha1;

import java.util.Objects;

public class PodPresetListItemsSpecEnvFrom {
    private PodPresetListItemsSpecEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodPresetListItemsSpecEnvFromSecretRef secretRef;

    public PodPresetListItemsSpecEnvFrom() {
        // no-op
    }

    public PodPresetListItemsSpecEnvFrom(final PodPresetListItemsSpecEnvFromConfigMapRef configMapRef,
                                         final String prefix,
                                         final PodPresetListItemsSpecEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodPresetListItemsSpecEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodPresetListItemsSpecEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodPresetListItemsSpecEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodPresetListItemsSpecEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodPresetListItemsSpecEnvFrom)) {
            return false;
        }
        final PodPresetListItemsSpecEnvFrom __otherCasted = (PodPresetListItemsSpecEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
