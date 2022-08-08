package io.yupiik.kubernetes.bindings.v1_17_7;

import java.util.Objects;

public class PodTemplateTemplateSpecEphemeralContainersEnvValueFrom {
    private PodTemplateTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private PodTemplateTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private PodTemplateTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private PodTemplateTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public PodTemplateTemplateSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersEnvValueFrom(final PodTemplateTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                  final PodTemplateTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                                  final PodTemplateTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                  final PodTemplateTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public PodTemplateTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final PodTemplateTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public PodTemplateTemplateSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final PodTemplateTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public PodTemplateTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final PodTemplateTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public PodTemplateTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final PodTemplateTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof PodTemplateTemplateSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final PodTemplateTemplateSpecEphemeralContainersEnvValueFrom __otherCasted = (PodTemplateTemplateSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
