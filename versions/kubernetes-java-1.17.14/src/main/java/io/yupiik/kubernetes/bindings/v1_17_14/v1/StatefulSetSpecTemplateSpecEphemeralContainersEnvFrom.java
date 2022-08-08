package io.yupiik.kubernetes.bindings.v1_17_14.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersEnvFrom {
    private StatefulSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private StatefulSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvFrom(final StatefulSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                 final String prefix,
                                                                 final StatefulSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final StatefulSetSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final StatefulSetSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
