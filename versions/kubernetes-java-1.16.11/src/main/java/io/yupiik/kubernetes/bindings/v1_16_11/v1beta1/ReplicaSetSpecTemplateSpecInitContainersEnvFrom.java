package io.yupiik.kubernetes.bindings.v1_16_11.v1beta1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersEnvFrom {
    private ReplicaSetSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicaSetSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public ReplicaSetSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersEnvFrom(final ReplicaSetSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                           final String prefix,
                                                           final ReplicaSetSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicaSetSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicaSetSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicaSetSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersEnvFrom __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
