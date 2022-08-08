package io.yupiik.kubernetes.bindings.v1_18_0;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersEnvFrom {
    private PodTemplateListItemsTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodTemplateListItemsTemplateSpecContainersEnvFromSecretRef secretRef;

    public PodTemplateListItemsTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersEnvFrom(final PodTemplateListItemsTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                             final String prefix,
                                                             final PodTemplateListItemsTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodTemplateListItemsTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodTemplateListItemsTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodTemplateListItemsTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersEnvFrom __otherCasted = (PodTemplateListItemsTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
