package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecContainersEnvValueFrom {
    private DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public DaemonSetListItemsSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersEnvValueFrom(final DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                    final DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                                    final DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                    final DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final DaemonSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecContainersEnvValueFrom __otherCasted = (DaemonSetListItemsSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
