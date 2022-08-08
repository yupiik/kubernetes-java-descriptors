package io.yupiik.kubernetes.bindings.v1_22_3.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                                                final String prefix,
                                                                                final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
