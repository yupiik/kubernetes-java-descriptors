package io.yupiik.kubernetes.bindings.v1_19_9.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom {
    private CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom(final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                        final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                                        final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                        final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
