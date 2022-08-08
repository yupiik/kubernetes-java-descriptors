package io.yupiik.kubernetes.bindings.v1_21_1.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersEnvFrom {
    private DeploymentListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DeploymentListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public DeploymentListItemsSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersEnvFrom(final DeploymentListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                                final String prefix,
                                                                final DeploymentListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DeploymentListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DeploymentListItemsSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DeploymentListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersEnvFrom __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
