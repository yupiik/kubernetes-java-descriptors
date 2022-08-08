package io.yupiik.kubernetes.bindings.v1_15_10;

import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersEnvFrom {
    private DeploymentSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DeploymentSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public DeploymentSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersEnvFrom(final DeploymentSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                           final String prefix,
                                                           final DeploymentSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DeploymentSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DeploymentSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DeploymentSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersEnvFrom __otherCasted = (DeploymentSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
