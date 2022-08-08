package io.yupiik.kubernetes.bindings.v1_17_17.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecEphemeralContainersEnvFrom {
    private DeploymentSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DeploymentSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public DeploymentSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersEnvFrom(final DeploymentSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                final String prefix,
                                                                final DeploymentSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DeploymentSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DeploymentSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final DeploymentSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (DeploymentSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
