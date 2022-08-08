package io.yupiik.kubernetes.bindings.v1_22_9.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom {
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                         final String prefix,
                                                                         final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
