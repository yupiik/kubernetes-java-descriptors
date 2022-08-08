package io.yupiik.kubernetes.bindings.v1_18_11.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFrom {
    private CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef secretRef;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFrom() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFrom(final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef,
                                                                   final String prefix,
                                                                   final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFrom)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFrom __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
