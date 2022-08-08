package io.yupiik.kubernetes.bindings.v1_22_8.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef {
    private String apiVersion;
    private String fieldPath;

    public StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef(final String apiVersion,
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef __otherCasted = (StatefulSetListItemsSpecTemplateSpecContainersEnvValueFromFieldRef) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fieldPath, __otherCasted.fieldPath);
    }
}
