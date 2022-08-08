package io.yupiik.kubernetes.bindings.v1_13_1.v1beta2;

import io.yupiik.kubernetes.bindings.v1_13_1.Validable;
import io.yupiik.kubernetes.bindings.v1_13_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SecretVolumeSource implements Validable<SecretVolumeSource> {
    private Integer defaultMode;
    private List<KeyToPath> items;
    private Boolean optional;
    private String secretName;

    public SecretVolumeSource() {
        // no-op
    }

    public SecretVolumeSource(final Integer defaultMode,
                              final List<KeyToPath> items,
                              final Boolean optional,
                              final String secretName) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<KeyToPath> getItems() {
        return items;
    }

    public void setItems(final List<KeyToPath> items) {
        this.items = items;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(final String secretName) {
        this.secretName = secretName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultMode,
                items,
                optional,
                secretName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SecretVolumeSource)) {
            return false;
        }
        final SecretVolumeSource __otherCasted = (SecretVolumeSource) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(optional, __otherCasted.optional) &&
            Objects.equals(secretName, __otherCasted.secretName);
    }

    public SecretVolumeSource defaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    public SecretVolumeSource items(final List<KeyToPath> items) {
        this.items = items;
        return this;
    }

    public SecretVolumeSource optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    public SecretVolumeSource secretName(final String secretName) {
        this.secretName = secretName;
        return this;
    }

    @Override
    public SecretVolumeSource validate() {
        return this;
    }
}
