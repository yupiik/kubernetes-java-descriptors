package io.yupiik.kubernetes.bindings.v1_17_3.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersEnvFrom {
    private ReplicaSetSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicaSetSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public ReplicaSetSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersEnvFrom(final ReplicaSetSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                       final String prefix,
                                                       final ReplicaSetSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicaSetSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicaSetSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicaSetSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersEnvFrom __otherCasted = (ReplicaSetSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
