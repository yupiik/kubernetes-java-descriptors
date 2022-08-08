package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.Objects;

public class JobSpecTemplateSpecContainersEnvFrom {
    private JobSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private JobSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public JobSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public JobSpecTemplateSpecContainersEnvFrom(final JobSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                final String prefix,
                                                final JobSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public JobSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final JobSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public JobSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final JobSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof JobSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final JobSpecTemplateSpecContainersEnvFrom __otherCasted = (JobSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
