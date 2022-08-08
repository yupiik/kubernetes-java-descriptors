package io.yupiik.kubernetes.bindings.v1_17_6.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecInitContainersEnvValueFrom {
    private DaemonSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private DaemonSetSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private DaemonSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private DaemonSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public DaemonSetSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersEnvValueFrom(final DaemonSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                               final DaemonSetSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                               final DaemonSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                               final DaemonSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final DaemonSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public DaemonSetSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DaemonSetSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public DaemonSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DaemonSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public DaemonSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final DaemonSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (DaemonSetSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
