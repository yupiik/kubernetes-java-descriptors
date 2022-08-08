package io.yupiik.kubernetes.bindings.v1_21_12.v1;

import java.util.Objects;

public class PodListItemsSpecInitContainersEnvValueFromFieldRef {
    private String apiVersion;
    private String fieldPath;

    public PodListItemsSpecInitContainersEnvValueFromFieldRef() {
        // no-op
    }

    public PodListItemsSpecInitContainersEnvValueFromFieldRef(final String apiVersion,
                                                              final String fieldPath) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                fieldPath);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecInitContainersEnvValueFromFieldRef)) {
            return false;
        }
        final PodListItemsSpecInitContainersEnvValueFromFieldRef __otherCasted = (PodListItemsSpecInitContainersEnvValueFromFieldRef) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fieldPath, __otherCasted.fieldPath);
    }
}
