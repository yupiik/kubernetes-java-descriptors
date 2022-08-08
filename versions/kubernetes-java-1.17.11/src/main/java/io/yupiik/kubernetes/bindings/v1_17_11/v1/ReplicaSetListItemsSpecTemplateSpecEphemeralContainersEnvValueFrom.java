package io.yupiik.kubernetes.bindings.v1_17_11.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom {
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                              final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                                              final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                              final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom __otherCasted = (ReplicaSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
