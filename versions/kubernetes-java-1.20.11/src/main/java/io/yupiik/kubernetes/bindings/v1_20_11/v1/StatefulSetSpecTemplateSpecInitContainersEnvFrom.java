package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersEnvFrom {
    private StatefulSetSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private StatefulSetSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public StatefulSetSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersEnvFrom(final StatefulSetSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                            final String prefix,
                                                            final StatefulSetSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final StatefulSetSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public StatefulSetSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final StatefulSetSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersEnvFrom __otherCasted = (StatefulSetSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
