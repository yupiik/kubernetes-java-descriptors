package io.yupiik.kubernetes.bindings.v1_23_9.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFrom {
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFrom(final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                                               final String prefix,
                                                                               final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFrom __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
