package io.yupiik.kubernetes.bindings.v1_20_3.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersEnvFrom {
    private ReplicaSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicaSetListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvFrom(final ReplicaSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                                final String prefix,
                                                                final ReplicaSetListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicaSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicaSetListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersEnvFrom __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
