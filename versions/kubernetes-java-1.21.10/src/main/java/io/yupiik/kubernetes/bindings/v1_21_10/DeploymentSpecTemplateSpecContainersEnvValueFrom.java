package io.yupiik.kubernetes.bindings.v1_21_10;

import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersEnvValueFrom {
    private DeploymentSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private DeploymentSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private DeploymentSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private DeploymentSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public DeploymentSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersEnvValueFrom(final DeploymentSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                            final DeploymentSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                            final DeploymentSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                            final DeploymentSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final DeploymentSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public DeploymentSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DeploymentSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public DeploymentSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DeploymentSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public DeploymentSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final DeploymentSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersEnvValueFrom __otherCasted = (DeploymentSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
