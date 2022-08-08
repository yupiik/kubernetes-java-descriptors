package io.yupiik.kubernetes.bindings.v1_18_17;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFrom {
    private ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFrom(final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                                    final String prefix,
                                                                                    final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
