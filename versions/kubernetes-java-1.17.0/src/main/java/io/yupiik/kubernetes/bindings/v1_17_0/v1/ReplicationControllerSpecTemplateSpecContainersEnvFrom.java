package io.yupiik.kubernetes.bindings.v1_17_0.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersEnvFrom {
    private ReplicationControllerSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicationControllerSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public ReplicationControllerSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersEnvFrom(final ReplicationControllerSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                                  final String prefix,
                                                                  final ReplicationControllerSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicationControllerSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicationControllerSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicationControllerSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersEnvFrom __otherCasted = (ReplicationControllerSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
