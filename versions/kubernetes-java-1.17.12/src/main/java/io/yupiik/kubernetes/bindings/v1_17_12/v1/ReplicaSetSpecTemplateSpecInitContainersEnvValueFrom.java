package io.yupiik.kubernetes.bindings.v1_17_12.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecInitContainersEnvValueFrom {
    private ReplicaSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private ReplicaSetSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private ReplicaSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private ReplicaSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public ReplicaSetSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersEnvValueFrom(final ReplicaSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                final ReplicaSetSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                final ReplicaSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                final ReplicaSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ReplicaSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ReplicaSetSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicaSetSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ReplicaSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicaSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public ReplicaSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final ReplicaSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (ReplicaSetSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
