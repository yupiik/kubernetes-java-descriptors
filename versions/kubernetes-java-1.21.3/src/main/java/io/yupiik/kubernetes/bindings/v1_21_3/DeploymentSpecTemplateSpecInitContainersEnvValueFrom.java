package io.yupiik.kubernetes.bindings.v1_21_3;

import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersEnvValueFrom {
    private DeploymentSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private DeploymentSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private DeploymentSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private DeploymentSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public DeploymentSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersEnvValueFrom(final DeploymentSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                final DeploymentSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                final DeploymentSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                final DeploymentSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final DeploymentSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public DeploymentSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DeploymentSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public DeploymentSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DeploymentSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public DeploymentSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final DeploymentSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (DeploymentSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
