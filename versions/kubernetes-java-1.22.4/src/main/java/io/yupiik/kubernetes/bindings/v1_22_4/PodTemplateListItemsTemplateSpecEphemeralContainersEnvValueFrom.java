package io.yupiik.kubernetes.bindings.v1_22_4;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFrom {
    private PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFrom(final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                           final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                                           final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                           final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFrom __otherCasted = (PodTemplateListItemsTemplateSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
