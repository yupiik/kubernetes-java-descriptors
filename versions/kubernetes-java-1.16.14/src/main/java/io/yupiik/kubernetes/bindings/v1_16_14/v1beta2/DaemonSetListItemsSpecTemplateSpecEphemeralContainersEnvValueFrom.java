package io.yupiik.kubernetes.bindings.v1_16_14.v1beta2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom {
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                             final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                                             final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                             final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom __otherCasted = (DaemonSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
