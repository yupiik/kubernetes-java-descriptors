package io.yupiik.kubernetes.bindings.v1_17_10.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFrom {
    private ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFrom(final ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                           final String prefix,
                                                                           final ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (ReplicationControllerSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
