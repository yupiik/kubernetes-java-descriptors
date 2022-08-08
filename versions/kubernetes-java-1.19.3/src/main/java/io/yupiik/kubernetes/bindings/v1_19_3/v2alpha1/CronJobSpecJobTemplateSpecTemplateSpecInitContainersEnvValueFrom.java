package io.yupiik.kubernetes.bindings.v1_19_3.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom {
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                            final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                            final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                            final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMapKeyRef,
                fieldRef,
                resourceFieldRef,
                secretKeyRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
