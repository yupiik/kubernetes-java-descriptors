package io.yupiik.kubernetes.bindings.v1_16_11.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersEnvFrom {
    private DeploymentListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DeploymentListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvFrom(final DeploymentListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                                    final String prefix,
                                                                    final DeploymentListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DeploymentListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DeploymentListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersEnvFrom __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
