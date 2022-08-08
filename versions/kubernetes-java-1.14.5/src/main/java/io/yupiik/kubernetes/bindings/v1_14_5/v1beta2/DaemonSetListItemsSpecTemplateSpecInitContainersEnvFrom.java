package io.yupiik.kubernetes.bindings.v1_14_5.v1beta2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersEnvFrom {
    private DaemonSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DaemonSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvFrom(final DaemonSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                                   final String prefix,
                                                                   final DaemonSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DaemonSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DaemonSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersEnvFrom __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
