package io.yupiik.kubernetes.bindings.v1_18_7;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFrom {
    private StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef;
    private StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef;
    private StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef;
    private StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef;

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFrom() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFrom(final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef,
                                                                      final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef,
                                                                      final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef,
                                                                      final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromFieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromResourceFieldRef resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFromSecretKeyRef secretKeyRef) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFrom)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFrom __otherCasted = (StatefulSetSpecTemplateSpecEphemeralContainersEnvValueFrom) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }
}
