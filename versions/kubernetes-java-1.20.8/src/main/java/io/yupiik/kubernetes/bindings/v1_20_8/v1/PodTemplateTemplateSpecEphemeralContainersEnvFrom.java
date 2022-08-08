package io.yupiik.kubernetes.bindings.v1_20_8.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersEnvFrom {
    private PodTemplateTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private PodTemplateTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public PodTemplateTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersEnvFrom(final PodTemplateTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                             final String prefix,
                                                             final PodTemplateTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final PodTemplateTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public PodTemplateTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final PodTemplateTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersEnvFrom __otherCasted = (PodTemplateTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
