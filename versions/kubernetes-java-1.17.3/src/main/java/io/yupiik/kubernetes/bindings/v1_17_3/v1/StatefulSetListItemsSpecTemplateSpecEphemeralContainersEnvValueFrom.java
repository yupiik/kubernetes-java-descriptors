package io.yupiik.kubernetes.bindings.v1_17_3.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom {
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                               final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                                               final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                               final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom __otherCasted = (StatefulSetListItemsSpecTemplateSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
