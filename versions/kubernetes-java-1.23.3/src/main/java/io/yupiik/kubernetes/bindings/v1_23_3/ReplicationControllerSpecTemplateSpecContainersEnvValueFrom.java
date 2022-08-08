package io.yupiik.kubernetes.bindings.v1_23_3;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecContainersEnvValueFrom {
    private ReplicationControllerSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private ReplicationControllerSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private ReplicationControllerSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private ReplicationControllerSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public ReplicationControllerSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersEnvValueFrom(final ReplicationControllerSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                       final ReplicationControllerSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                                       final ReplicationControllerSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                       final ReplicationControllerSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ReplicationControllerSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ReplicationControllerSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicationControllerSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ReplicationControllerSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicationControllerSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public ReplicationControllerSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final ReplicationControllerSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecContainersEnvValueFrom __otherCasted = (ReplicationControllerSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
