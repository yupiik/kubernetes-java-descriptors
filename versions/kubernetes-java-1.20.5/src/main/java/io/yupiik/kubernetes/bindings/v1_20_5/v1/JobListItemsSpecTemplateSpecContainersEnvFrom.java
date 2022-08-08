package io.yupiik.kubernetes.bindings.v1_20_5.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecContainersEnvFrom {
    private JobListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private JobListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public JobListItemsSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersEnvFrom(final JobListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                         final String prefix,
                                                         final JobListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final JobListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public JobListItemsSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final JobListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecContainersEnvFrom __otherCasted = (JobListItemsSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
