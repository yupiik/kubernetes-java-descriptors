package io.yupiik.kubernetes.bindings.v1_19_9.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef {
    private String apiVersion;
    private String fieldPath;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef(final String apiVersion,
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fieldPath, __otherCasted.fieldPath);
    }
}
