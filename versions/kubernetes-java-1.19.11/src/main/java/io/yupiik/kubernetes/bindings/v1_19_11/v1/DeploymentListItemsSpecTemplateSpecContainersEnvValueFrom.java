package io.yupiik.kubernetes.bindings.v1_19_11.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersEnvValueFrom {
    private DeploymentListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private DeploymentListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private DeploymentListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private DeploymentListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public DeploymentListItemsSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersEnvValueFrom(final DeploymentListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                     final DeploymentListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                                     final DeploymentListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                     final DeploymentListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final DeploymentListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public DeploymentListItemsSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DeploymentListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public DeploymentListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DeploymentListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public DeploymentListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final DeploymentListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersEnvValueFrom __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
