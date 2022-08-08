package io.yupiik.kubernetes.bindings.v1_19_0.v1;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFrom {
    private DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFrom(final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                        final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                        final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                        final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (DaemonSetListItemsSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
