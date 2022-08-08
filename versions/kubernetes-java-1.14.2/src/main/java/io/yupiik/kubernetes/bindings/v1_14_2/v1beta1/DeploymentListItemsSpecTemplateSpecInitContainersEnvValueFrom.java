package io.yupiik.kubernetes.bindings.v1_14_2.v1beta1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFrom {
    private DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFrom(final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                         final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                         final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                         final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (DeploymentListItemsSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
