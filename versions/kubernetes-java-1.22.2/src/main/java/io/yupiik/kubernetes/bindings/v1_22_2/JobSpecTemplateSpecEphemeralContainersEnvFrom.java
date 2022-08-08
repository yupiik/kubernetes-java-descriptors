package io.yupiik.kubernetes.bindings.v1_22_2;

import java.util.Objects;

public class JobSpecTemplateSpecEphemeralContainersEnvFrom {
    private JobSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private JobSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public JobSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersEnvFrom(final JobSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                         final String prefix,
                                                         final JobSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public JobSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final JobSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public JobSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final JobSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof JobSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final JobSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (JobSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
