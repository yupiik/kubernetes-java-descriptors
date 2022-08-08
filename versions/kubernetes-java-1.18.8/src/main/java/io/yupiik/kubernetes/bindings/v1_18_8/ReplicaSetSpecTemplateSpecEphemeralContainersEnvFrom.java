package io.yupiik.kubernetes.bindings.v1_18_8;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersEnvFrom {
    private ReplicaSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicaSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvFrom(final ReplicaSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                final String prefix,
                                                                final ReplicaSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicaSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicaSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
