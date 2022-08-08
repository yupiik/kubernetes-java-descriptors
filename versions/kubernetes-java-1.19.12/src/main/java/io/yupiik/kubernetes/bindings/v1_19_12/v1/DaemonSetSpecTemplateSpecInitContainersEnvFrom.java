package io.yupiik.kubernetes.bindings.v1_19_12.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersEnvFrom {
    private DaemonSetSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DaemonSetSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public DaemonSetSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersEnvFrom(final DaemonSetSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                          final String prefix,
                                                          final DaemonSetSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DaemonSetSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DaemonSetSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DaemonSetSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersEnvFrom __otherCasted = (DaemonSetSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
