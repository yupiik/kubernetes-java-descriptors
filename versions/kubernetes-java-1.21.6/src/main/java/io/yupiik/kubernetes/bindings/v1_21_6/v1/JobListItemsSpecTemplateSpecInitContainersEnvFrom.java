package io.yupiik.kubernetes.bindings.v1_21_6.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersEnvFrom {
    private JobListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private JobListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public JobListItemsSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersEnvFrom(final JobListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                             final String prefix,
                                                             final JobListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final JobListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public JobListItemsSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final JobListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersEnvFrom __otherCasted = (JobListItemsSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
