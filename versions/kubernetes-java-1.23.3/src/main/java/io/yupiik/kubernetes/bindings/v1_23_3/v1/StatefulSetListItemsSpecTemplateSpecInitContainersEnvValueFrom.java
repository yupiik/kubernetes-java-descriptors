package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFrom {
    private StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFrom(final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                          final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                          final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                          final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
