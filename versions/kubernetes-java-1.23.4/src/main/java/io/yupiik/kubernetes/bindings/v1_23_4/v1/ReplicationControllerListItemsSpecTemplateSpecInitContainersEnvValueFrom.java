package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFrom {
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFrom(final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                                    final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                                    final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                                    final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
