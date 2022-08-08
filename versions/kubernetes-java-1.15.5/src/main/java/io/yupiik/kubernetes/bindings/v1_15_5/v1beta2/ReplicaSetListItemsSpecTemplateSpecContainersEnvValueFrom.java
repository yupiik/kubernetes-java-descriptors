package io.yupiik.kubernetes.bindings.v1_15_5.v1beta2;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFrom {
    private ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFrom(final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                     final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                                     final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                     final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFrom __otherCasted = (ReplicaSetListItemsSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
