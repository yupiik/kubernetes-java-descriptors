package io.yupiik.kubernetes.bindings.v1_20_15;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFrom {
    private ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFrom(final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                     final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                                     final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                     final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFrom __otherCasted = (ReplicaSetSpecTemplateSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
