package io.yupiik.kubernetes.bindings.v1_15_5.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFrom {
    private ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFrom(final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                                final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                                                final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                                final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFrom __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
