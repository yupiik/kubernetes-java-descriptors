package io.yupiik.kubernetes.bindings.v1_18_0.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecEphemeralContainersEnvFrom {
    private JobListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private JobListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public JobListItemsSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersEnvFrom(final JobListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                  final String prefix,
                                                                  final JobListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final JobListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public JobListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final JobListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (JobListItemsSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
