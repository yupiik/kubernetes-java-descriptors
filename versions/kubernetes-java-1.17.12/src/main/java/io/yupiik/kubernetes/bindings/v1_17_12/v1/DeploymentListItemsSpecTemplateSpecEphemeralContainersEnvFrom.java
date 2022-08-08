package io.yupiik.kubernetes.bindings.v1_17_12.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFrom {
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFrom(final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                         final String prefix,
                                                                         final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
