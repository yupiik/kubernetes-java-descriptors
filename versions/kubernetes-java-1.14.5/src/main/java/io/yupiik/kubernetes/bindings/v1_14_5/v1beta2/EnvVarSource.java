package io.yupiik.kubernetes.bindings.v1_14_5.v1beta2;

import io.yupiik.kubernetes.bindings.v1_14_5.Validable;
import io.yupiik.kubernetes.bindings.v1_14_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EnvVarSource implements Validable<EnvVarSource> {
    private ConfigMapKeySelector configMapKeyRef;
    private ObjectFieldSelector fieldRef;
    private ResourceFieldSelector resourceFieldRef;
    private SecretKeySelector secretKeyRef;

    public EnvVarSource() {
        // no-op
    }

    public EnvVarSource(final ConfigMapKeySelector configMapKeyRef,
                        final ObjectFieldSelector fieldRef,
                        final ResourceFieldSelector resourceFieldRef,
                        final SecretKeySelector secretKeyRef) {
        // no-op
    }

    public ConfigMapKeySelector getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(final ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ObjectFieldSelector getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(final ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ResourceFieldSelector getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(final ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public SecretKeySelector getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(final SecretKeySelector secretKeyRef) {
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
        if (!(__other instanceof EnvVarSource)) {
            return false;
        }
        final EnvVarSource __otherCasted = (EnvVarSource) __other;
        return Objects.equals(configMapKeyRef, __otherCasted.configMapKeyRef) &&
            Objects.equals(fieldRef, __otherCasted.fieldRef) &&
            Objects.equals(resourceFieldRef, __otherCasted.resourceFieldRef) &&
            Objects.equals(secretKeyRef, __otherCasted.secretKeyRef);
    }

    public EnvVarSource configMapKeyRef(final ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        return this;
    }

    public EnvVarSource fieldRef(final ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
        return this;
    }

    public EnvVarSource resourceFieldRef(final ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
        return this;
    }

    public EnvVarSource secretKeyRef(final SecretKeySelector secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
        return this;
    }

    @Override
    public EnvVarSource validate() {
        return this;
    }
}
