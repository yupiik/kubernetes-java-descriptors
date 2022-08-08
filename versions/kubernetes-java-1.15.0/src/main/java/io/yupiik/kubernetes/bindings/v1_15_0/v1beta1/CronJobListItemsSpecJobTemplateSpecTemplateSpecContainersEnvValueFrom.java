package io.yupiik.kubernetes.bindings.v1_15_0.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                                 final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                                                 final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                                 final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
