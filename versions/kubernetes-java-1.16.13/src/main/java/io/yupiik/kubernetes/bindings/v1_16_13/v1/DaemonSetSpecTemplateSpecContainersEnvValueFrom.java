package io.yupiik.kubernetes.bindings.v1_16_13.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecContainersEnvValueFrom {
    private DaemonSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private DaemonSetSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private DaemonSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private DaemonSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public DaemonSetSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersEnvValueFrom(final DaemonSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                           final DaemonSetSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                           final DaemonSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                           final DaemonSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final DaemonSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public DaemonSetSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DaemonSetSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public DaemonSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DaemonSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public DaemonSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final DaemonSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecContainersEnvValueFrom __otherCasted = (DaemonSetSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
