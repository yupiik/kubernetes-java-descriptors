package io.yupiik.kubernetes.bindings.v1_14_0;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersEnvValueFrom {
    private PodTemplateListItemsTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodTemplateListItemsTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private PodTemplateListItemsTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodTemplateListItemsTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodTemplateListItemsTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnvValueFrom(final PodTemplateListItemsTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                      final PodTemplateListItemsTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                      final PodTemplateListItemsTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                      final PodTemplateListItemsTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodTemplateListItemsTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodTemplateListItemsTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodTemplateListItemsTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodTemplateListItemsTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodTemplateListItemsTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersEnvValueFrom __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
