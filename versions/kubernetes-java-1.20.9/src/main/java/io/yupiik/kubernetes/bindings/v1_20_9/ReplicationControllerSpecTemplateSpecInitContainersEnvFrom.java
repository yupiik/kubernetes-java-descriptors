package io.yupiik.kubernetes.bindings.v1_20_9;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersEnvFrom {
    private ReplicationControllerSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicationControllerSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public ReplicationControllerSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersEnvFrom(final ReplicationControllerSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                                      final String prefix,
                                                                      final ReplicationControllerSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicationControllerSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicationControllerSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersEnvFrom __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
