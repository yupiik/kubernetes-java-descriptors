package io.yupiik.kubernetes.bindings.v1_16_12.v1beta1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom {
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom(final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                              final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                                              final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                              final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom __otherCasted = (DeploymentListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
