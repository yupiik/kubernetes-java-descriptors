package io.yupiik.kubernetes.bindings.v1_16_11.v1beta2;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersEnvValueFrom {
    private StatefulSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private StatefulSetSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef;
    private StatefulSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private StatefulSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef;

    public StatefulSetSpecTemplateSpecContainersEnvValueFrom() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersEnvValueFrom(final StatefulSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                             final StatefulSetSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef,
                                                             final StatefulSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                             final StatefulSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final StatefulSetSpecTemplateSpecContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public StatefulSetSpecTemplateSpecContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final StatefulSetSpecTemplateSpecContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public StatefulSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final StatefulSetSpecTemplateSpecContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public StatefulSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final StatefulSetSpecTemplateSpecContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersEnvValueFrom)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersEnvValueFrom __otherCasted = (StatefulSetSpecTemplateSpecContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
