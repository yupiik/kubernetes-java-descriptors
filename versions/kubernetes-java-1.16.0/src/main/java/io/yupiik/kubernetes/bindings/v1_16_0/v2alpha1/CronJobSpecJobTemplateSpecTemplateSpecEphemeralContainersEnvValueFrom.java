package io.yupiik.kubernetes.bindings.v1_16_0.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFrom {
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFrom(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                                 final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                                                 final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                                 final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFrom __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
