package io.yupiik.kubernetes.bindings.v1_19_9;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersEnvValueFrom {
    private StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public StatefulSetListItemsSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnvValueFrom(final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                      final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                                      final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                      final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFrom __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
