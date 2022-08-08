package io.yupiik.kubernetes.bindings.v1_23_6.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecEphemeralContainersEnvFrom {
    private DaemonSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private DaemonSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public DaemonSetSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersEnvFrom(final DaemonSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                               final String prefix,
                                                               final DaemonSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final DaemonSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public DaemonSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final DaemonSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (DaemonSetSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
