package io.yupiik.kubernetes.bindings.v1_20_6;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersEnvFrom {
    private StatefulSetSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private StatefulSetSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public StatefulSetSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersEnvFrom(final StatefulSetSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                        final String prefix,
                                                        final StatefulSetSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final StatefulSetSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public StatefulSetSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final StatefulSetSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersEnvFrom __otherCasted = (StatefulSetSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
