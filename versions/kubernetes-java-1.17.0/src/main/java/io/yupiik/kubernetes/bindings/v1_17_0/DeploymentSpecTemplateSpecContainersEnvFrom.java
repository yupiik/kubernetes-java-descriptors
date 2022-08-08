package io.yupiik.kubernetes.bindings.v1_17_0;

import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersEnvFrom {
    private DeploymentSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DeploymentSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public DeploymentSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersEnvFrom(final DeploymentSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                       final String prefix,
                                                       final DeploymentSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DeploymentSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DeploymentSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DeploymentSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersEnvFrom __otherCasted = (DeploymentSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
