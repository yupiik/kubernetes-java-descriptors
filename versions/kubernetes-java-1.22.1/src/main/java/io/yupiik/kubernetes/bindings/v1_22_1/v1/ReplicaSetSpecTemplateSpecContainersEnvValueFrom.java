package io.yupiik.kubernetes.bindings.v1_22_1.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecContainersEnvValueFrom {
    private ReplicaSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private ReplicaSetSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private ReplicaSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private ReplicaSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public ReplicaSetSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersEnvValueFrom(final ReplicaSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                            final ReplicaSetSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                            final ReplicaSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                            final ReplicaSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ReplicaSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ReplicaSetSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicaSetSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ReplicaSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicaSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public ReplicaSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final ReplicaSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecContainersEnvValueFrom __otherCasted = (ReplicaSetSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
