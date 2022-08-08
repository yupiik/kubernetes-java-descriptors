package io.yupiik.kubernetes.bindings.v1_18_7.v1;

import java.util.Objects;

public class JobSpecTemplateSpecInitContainersEnvFrom {
    private JobSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private JobSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public JobSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersEnvFrom(final JobSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                    final String prefix,
                                                    final JobSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public JobSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final JobSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public JobSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final JobSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof JobSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final JobSpecTemplateSpecInitContainersEnvFrom __otherCasted = (JobSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
