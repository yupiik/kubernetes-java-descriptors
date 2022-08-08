package io.yupiik.kubernetes.bindings.v1_18_9.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom {
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                        final String prefix,
                                                                        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
