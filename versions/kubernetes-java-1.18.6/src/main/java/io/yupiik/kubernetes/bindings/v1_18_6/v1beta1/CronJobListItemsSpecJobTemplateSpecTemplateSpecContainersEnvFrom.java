package io.yupiik.kubernetes.bindings.v1_18_6.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFrom {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFrom(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                                            final String prefix,
                                                                            final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFrom __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
