package io.yupiik.kubernetes.bindings.v1_21_12;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom {
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef,
                                                                          final String prefix,
                                                                          final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
