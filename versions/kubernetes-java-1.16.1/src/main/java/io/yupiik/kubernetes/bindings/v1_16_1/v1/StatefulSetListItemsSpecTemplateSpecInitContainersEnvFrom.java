package io.yupiik.kubernetes.bindings.v1_16_1.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersEnvFrom {
    private StatefulSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private StatefulSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvFrom(final StatefulSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                                     final String prefix,
                                                                     final StatefulSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final StatefulSetListItemsSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final StatefulSetListItemsSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersEnvFrom __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
