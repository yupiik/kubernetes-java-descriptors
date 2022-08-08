package io.yupiik.kubernetes.bindings.v1_18_13.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecInitContainersEnvFrom {
    private PodTemplateTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodTemplateTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public PodTemplateTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersEnvFrom(final PodTemplateTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                        final String prefix,
                                                        final PodTemplateTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodTemplateTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodTemplateTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodTemplateTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodTemplateTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodTemplateTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final PodTemplateTemplateSpecInitContainersEnvFrom __otherCasted = (PodTemplateTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
