package io.yupiik.kubernetes.bindings.v1_17_15;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersEnvFrom {
    private StatefulSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private StatefulSetListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public StatefulSetListItemsSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnvFrom(final StatefulSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                                 final String prefix,
                                                                 final StatefulSetListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final StatefulSetListItemsSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final StatefulSetListItemsSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersEnvFrom __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
