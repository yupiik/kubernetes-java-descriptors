package io.yupiik.kubernetes.bindings.v1_17_11.v1beta2;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFrom {
    private ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFrom(final ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                                    final String prefix,
                                                                    final ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFrom __otherCasted = (ReplicaSetListItemsSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
