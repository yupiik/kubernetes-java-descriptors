package io.yupiik.kubernetes.bindings.v1_15_9.v1beta2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersEnvFrom {
    private DaemonSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DaemonSetListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public DaemonSetListItemsSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersEnvFrom(final DaemonSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                               final String prefix,
                                                               final DaemonSetListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DaemonSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DaemonSetListItemsSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DaemonSetListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersEnvFrom __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
