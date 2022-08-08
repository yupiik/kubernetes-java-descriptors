package io.yupiik.kubernetes.bindings.v1_16_11.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersEnvValueFrom {
    private PodTemplateListItemsTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodTemplateListItemsTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private PodTemplateListItemsTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodTemplateListItemsTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodTemplateListItemsTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersEnvValueFrom(final PodTemplateListItemsTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                  final PodTemplateListItemsTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                                  final PodTemplateListItemsTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                  final PodTemplateListItemsTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodTemplateListItemsTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodTemplateListItemsTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodTemplateListItemsTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodTemplateListItemsTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodTemplateListItemsTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodTemplateListItemsTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodTemplateListItemsTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersEnvValueFrom __otherCasted = (PodTemplateListItemsTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
