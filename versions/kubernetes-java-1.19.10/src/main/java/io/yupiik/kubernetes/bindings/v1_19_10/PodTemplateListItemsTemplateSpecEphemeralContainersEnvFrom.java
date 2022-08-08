package io.yupiik.kubernetes.bindings.v1_19_10;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersEnvFrom {
    private PodTemplateListItemsTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodTemplateListItemsTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvFrom(final PodTemplateListItemsTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                      final String prefix,
                                                                      final PodTemplateListItemsTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodTemplateListItemsTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodTemplateListItemsTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersEnvFrom __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
