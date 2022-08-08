package io.yupiik.kubernetes.bindings.v1_16_5.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom {
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef;
    private String prefix;
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFromSecretRef secretRef;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef,
                                                                       final String prefix,
                                                                       final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFromConfigMapRef getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFromConfigMapRef configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFromSecretRef getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFromSecretRef secretRef) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvFrom) __other;
        return Objects.equals(configMapRef, __otherCasted.configMapRef) &&
            Objects.equals(prefix, __otherCasted.prefix) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }
}
