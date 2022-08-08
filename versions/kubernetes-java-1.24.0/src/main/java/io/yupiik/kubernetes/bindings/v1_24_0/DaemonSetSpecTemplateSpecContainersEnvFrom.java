package io.yupiik.kubernetes.bindings.v1_24_0;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersEnvFrom {
    private DaemonSetSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DaemonSetSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public DaemonSetSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersEnvFrom(final DaemonSetSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                      final String prefix,
                                                      final DaemonSetSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DaemonSetSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DaemonSetSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DaemonSetSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersEnvFrom __otherCasted = (DaemonSetSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
