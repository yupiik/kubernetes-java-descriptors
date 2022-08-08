package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                                     final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                                     final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                                     final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
