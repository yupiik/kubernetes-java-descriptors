package io.yupiik.kubernetes.bindings.v1_23_2;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecInitContainersEnvValueFrom {
    private ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public ReplicationControllerSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersEnvValueFrom(final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                           final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                           final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                           final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (ReplicationControllerSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
