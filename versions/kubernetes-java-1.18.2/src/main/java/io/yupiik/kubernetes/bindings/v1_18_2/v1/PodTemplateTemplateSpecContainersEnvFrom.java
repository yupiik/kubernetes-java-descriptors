package io.yupiik.kubernetes.bindings.v1_18_2.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecContainersEnvFrom {
    private PodTemplateTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodTemplateTemplateSpecContainersEnvFromSecretRef secretRef;

    public PodTemplateTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public PodTemplateTemplateSpecContainersEnvFrom(final PodTemplateTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                    final String prefix,
                                                    final PodTemplateTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodTemplateTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodTemplateTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodTemplateTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodTemplateTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodTemplateTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final PodTemplateTemplateSpecContainersEnvFrom __otherCasted = (PodTemplateTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
