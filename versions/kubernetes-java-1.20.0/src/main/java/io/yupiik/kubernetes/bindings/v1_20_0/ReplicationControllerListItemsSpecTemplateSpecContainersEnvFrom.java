package io.yupiik.kubernetes.bindings.v1_20_0;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersEnvFrom {
    private ReplicationControllerListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicationControllerListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvFrom(final ReplicationControllerListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                                           final String prefix,
                                                                           final ReplicationControllerListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicationControllerListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicationControllerListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersEnvFrom __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
