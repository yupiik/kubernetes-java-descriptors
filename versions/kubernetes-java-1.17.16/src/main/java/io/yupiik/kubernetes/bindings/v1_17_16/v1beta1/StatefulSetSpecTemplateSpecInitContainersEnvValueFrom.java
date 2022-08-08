package io.yupiik.kubernetes.bindings.v1_17_16.v1beta1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecInitContainersEnvValueFrom {
    private StatefulSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private StatefulSetSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef;
    private StatefulSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private StatefulSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef;

    public StatefulSetSpecTemplateSpecInitContainersEnvValueFrom() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersEnvValueFrom(final StatefulSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                 final StatefulSetSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef,
                                                                 final StatefulSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                 final StatefulSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final StatefulSetSpecTemplateSpecInitContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public StatefulSetSpecTemplateSpecInitContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final StatefulSetSpecTemplateSpecInitContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public StatefulSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final StatefulSetSpecTemplateSpecInitContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public StatefulSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final StatefulSetSpecTemplateSpecInitContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecInitContainersEnvValueFrom)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecInitContainersEnvValueFrom __otherCasted = (StatefulSetSpecTemplateSpecInitContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
