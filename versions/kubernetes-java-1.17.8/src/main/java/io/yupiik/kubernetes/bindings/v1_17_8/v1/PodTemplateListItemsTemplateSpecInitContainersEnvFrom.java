package io.yupiik.kubernetes.bindings.v1_17_8.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersEnvFrom {
    private PodTemplateListItemsTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodTemplateListItemsTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public PodTemplateListItemsTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnvFrom(final PodTemplateListItemsTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                                 final String prefix,
                                                                 final PodTemplateListItemsTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodTemplateListItemsTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodTemplateListItemsTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersEnvFrom __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
